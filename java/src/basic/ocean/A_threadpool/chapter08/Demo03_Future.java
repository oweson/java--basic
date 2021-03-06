package basic.ocean.A_threadpool.chapter08;

import java.util.concurrent.*;

/**
 * 异步任务Future
 *
 * @author Yicheng Wang
 */
public class Demo03_Future {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newFixedThreadPool(1);

        Future<String> future = service.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Thread.currentThread().getName() + " - test executor";
        });
        System.out.println(future);
        System.out.println(future.isDone());
        // 查看线程是否结束， 任务是否完成。 call方法是否执行结束

        System.out.println(future.get());
        // 获取call方法的返回值。
        System.out.println(future.isDone());
        service.shutdown();
    }

}
