package basic.ocean.A_threadpool.C_super.executor;

import java.util.concurrent.*;

/**
 * SingleThreadPool类型测试
 */
public class SingleThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            FutureTask<String> futureTask = new FutureTask<String>(new MySingleThread());
            // 提交任务
            executorService.submit(new MySingleThread());
        }
        // 关闭线程池
        executorService.shutdown();
    }
}

class MySingleThread implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread().getName() + " begin...");
        Thread.sleep(5 * 1000);
        System.out.println("Thread: " + Thread.currentThread().getName() + " end...");
        return Thread.currentThread().getName();
    }
}

