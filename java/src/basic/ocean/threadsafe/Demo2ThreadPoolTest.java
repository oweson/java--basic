package basic.ocean.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 20:25
 */
public class Demo2ThreadPoolTest implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            Demo2ThreadPoolTest demo2ThreadPoolTest = new Demo2ThreadPoolTest();
            Future<?> submit = executorService.submit(demo2ThreadPoolTest);
            Thread.sleep(2);

        }

        executorService.shutdown();


    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
