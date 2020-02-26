package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * shutdown:当我们调用shutdown后，线程池将不再接受新的任务，但也不会去强制终止已经提交或者正在执行中的任务
 *
 * @author Peter
 * 代码模拟了正在运行的状态，然后调用shutdown，接着再往里面添加任务，肯定是拒绝添加的，请看输出结果：
 */
public class ThreadPool_Shutdown {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 5; i++) {
            System.err.println(i);
            pool.execute(() -> {
                try {
                    Thread.sleep(30000);
                    System.out.println("---");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(1000);
        pool.shutdown();
        // todo 下面开始异常
        pool.execute(() -> {
            try {
                Thread.sleep(30000);
                System.out.println("----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-----");
        });
    }
}
