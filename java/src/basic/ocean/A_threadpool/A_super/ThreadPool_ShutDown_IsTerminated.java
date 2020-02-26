package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一些业务场景下需要知道线程池中的任务是否全部执行完成，当我们关闭线程池之后，
 * 可以用isTerminated来判断所有的线程是否执行完成，
 * 千万不要用isShutdown，isShutdown只是返回你是否调用过shutdown的结果。
 */
public class ThreadPool_ShutDown_IsTerminated {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			System.err.println(i);
			pool.execute(() -> {
				try {
					Thread.sleep(3000);
					System.out.println("--");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		Thread.sleep(1000);
		pool.shutdown();
		while(true){
			if(pool.isTerminated()){
				System.out.println("所有的子线程都结束了");
				break;
			}
			Thread.sleep(1000);
		}
	}
}
