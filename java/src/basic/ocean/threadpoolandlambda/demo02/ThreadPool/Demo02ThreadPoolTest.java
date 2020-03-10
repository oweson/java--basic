package basic.ocean.threadpoolandlambda.demo02.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/1 0001 10:40
 */
public class Demo02ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"ppx"));
        }
        executorService.shutdown();
    }
}
