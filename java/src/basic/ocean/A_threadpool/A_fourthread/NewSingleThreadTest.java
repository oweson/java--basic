package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/26 11:26
 * 一个单线程的线程池，这个线程池只有一个线程在工作，即相当于单线程串行执行所有任务。
 * * 如果这个唯一的线程因为异常结束，那么会有一个新的线程来替代它。
 * * 此线程池保证所有任务的执行顺序是按照任务的提交顺序执行的。
 */
public class NewSingleThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            executorService.execute(() ->
                    System.out.println(Thread.currentThread().getName() + "-----" + finalI));
            if(i==0){
                try {
                    System.out.println(1/0);
                } catch (Exception e) {
                }
            }
        }

    }
}
