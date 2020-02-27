package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * submit方法适用于需要关注返回值的场景
 * 无论参数是Callable还是Runnable，最终都会被封装成RunnableFuture，然后再调用execute执行。
 * submit(Callable task);
 *
 */
public class ThreadPool_Submit_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		Future<String> future = pool.submit(() -> "Hello");
		String result = future.get();
		System.out.println(result);
	}
}
