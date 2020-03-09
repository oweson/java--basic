package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/26 11:27
 */
public class NewCachedThreadTest {
    public static void main(String[] args) {

        //创建可缓存线程池
        //线程池为无限大，当第一个
        /**
         * 创建一个可缓存的线程池
         * 如果线程池的大小超过了处理任务所需要的线程，
         * 那么就会回收部分空闲的线程，当任务增加时，此线程池又添加新线程来处理任务。
         * 解释
         *
         * 线程池最大线程数为Integer.MAX_VALUE。
         * 当某个线程空闲60s，则会自动销毁;
         *
         *
         * * 我们执行任务是用的execute方法，除了execute方法，还有一个submit方法也可以执行我们提交的任务。
         *  execute适用于不需要关注返回值的场景，只需要将线程丢到线程池中去执行就可以了
         */
        /*1.创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
         * 2.线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
         * */

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0; i<10; i++) {
            final int finalI = i;
            //执行execute 表示创建了线程  类似start
            executorService.execute(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-----" + finalI);
            });
        }
        executorService.shutdown();


    }
}
