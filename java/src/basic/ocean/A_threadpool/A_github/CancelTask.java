package basic.ocean.A_threadpool.A_github;

import java.util.concurrent.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/26 11:04
 */
public class CancelTask {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<String> result = executorService.submit(new Task());
        try {
            Thread.currentThread().sleep(500);
            result.cancel(true);
            System.out.println(result.isCancelled());
            // todo 中断以后不可获得值了
           // System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static class Task implements Callable<String> {
        public Task(){}
        @Override
        public String call() throws Exception {
            Thread.currentThread().sleep(2000);
            return "task";
        }

    }
}
