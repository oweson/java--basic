package basic.ocean.A_threadpool.A_corepool;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPoolExecutor方式使用线程池
 *
 * @author devinlee
 * @date 20191211
 */
public class ThreadPoolTest {

    @Test
    public void threadPoolExecutor() {

        long currentTimeMillis = System.currentTimeMillis();

        /**
         * 构造参数说明：
         * int corePoolSize 核心线程池大小
         * int maximumPoolSize 最大线程池大小
         * long keepAliveTime 线程最大空闲时间
         * TimeUnit unit 时间单位
         * BlockingQueue<Runnable> workQueue 线程等待队列
         * ThreadFactory threadFactory 线程创建工厂
         * RejectedExecutionHandler handler 拒绝策略
         */

        //构建一个线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 5, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3));

        for (int i = 1; i <= 10; i++) {
            try {
                String task = "task=" + i;
                System.out.println("创建任务并提交到线程池中：" + task);
                threadPool.execute(new ThreadPoolTask(task));

                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //关闭线程池
        try {

            //等待所有线程执行完毕当前任务。
            threadPool.shutdown();

            boolean loop = true;
            do {
                //等待所有线程执行完毕当前任务结束
                //等待2秒
                loop = !threadPool.awaitTermination(2, TimeUnit.SECONDS);
            } while (loop);

            if (loop != true) {
                System.out.println("所有线程执行完毕");
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            System.out.println("耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
