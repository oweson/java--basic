package basic.ocean.A_threadpool.chapter08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 无容量限制的线程池（最大容量默认为Integer.MAX_VALUE）
 * 
 * @author Yicheng Wang
 */
public class Demo05_CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		System.out.println(service);
		for (int i = 0; i < 5; i++) {
			service.execute(() -> {
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " - test executor");
			});
		}

		System.out.println(service);

		try {
			TimeUnit.SECONDS.sleep(65);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(service);
	}

}
