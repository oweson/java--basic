package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/26 11:27
 * 创建固定大小的线程池，每次提交任务就创建一个线程，直到线程达到线程池的最大大小
 * 线程池的大小一旦达到最大值就会保持不变，如果某个线程因为执行异常而结束，
 * 那么线程池一定会补充一个新线程
 */
public class NewFixedThreadTest {
    public static void main(String[] args) {
        //newFixedThreadPool创建线程数为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            executorService.execute(() ->
                    System.out.println(Thread.currentThread().getName() + "-----" + finalI));
            if ((i == 2) || (i == 3)) {
                try {
                    System.out.println(1 / 0);
                } catch (Exception e) {
                    continue;
                }

            }
        }

    }
}
