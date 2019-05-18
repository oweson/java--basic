package eclipse.mar.thread.ThreadPool;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/25 0025 10:48
 */
public class CreateThreadByPool {
    public static final int POOL_SIZE = 10;

    public static void main(String[] args) {
        /** 1 线程池创建线程；*/
        ExecutorService executorService = newFixedThreadPool(10);
        for (int i = 0; i < POOL_SIZE; i++) {
             PigWithRed pig = new PigWithRed();
            executorService.execute(pig);

        }
        executorService.shutdown();


    }
}
class PigWithRed implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}
