package basic.ocean.thread.FourThreadCreate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/17 0017 17:54
 */
public class Demo1ThreadPoolTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // 1 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        executorService.submit(new Demo1ThreadPoolTest());
        // 2 关闭线程池；
        executorService.shutdown();

    }
}
