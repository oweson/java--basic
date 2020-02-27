package basic.ocean.A_threadpool.C_super.executor;

import java.util.concurrent.*;

/**
 * FixedThreadPool类型测试
 */
public class FixedThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyFixedThread());
            // 提交任务
            Future<Integer> submit = (Future<Integer>) executorService.submit(futureTask);
            System.out.println(submit.get());
        }
        // 关闭线程池
        executorService.shutdown();
    }
}

class MyFixedThread implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread().getName() + " begin...");
        Thread.sleep(5 * 1000);
        System.out.println("Thread: " + Thread.currentThread().getName() + " end...");
        return 2020;
    }
}

