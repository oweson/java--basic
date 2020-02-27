package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * submit������������Ҫ��ע����ֵ�ĳ���
 * ���۲�����Callable����Runnable�����ն��ᱻ��װ��RunnableFuture��Ȼ���ٵ���executeִ�С�
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
