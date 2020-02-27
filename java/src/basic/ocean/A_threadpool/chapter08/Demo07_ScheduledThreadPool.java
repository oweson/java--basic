package basic.ocean.A_threadpool.chapter08;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 计划任务线程池
 * 
 * @author Yicheng Wang
 */
public class Demo07_ScheduledThreadPool {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		System.out.println(service);

		// 定时完成任务。 scheduleAtFixedRate(Runnable, start_limit, limit, timeunit)
		// runnable - 要执行的任务。
		service.scheduleAtFixedRate(() -> {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}, 0, 300, TimeUnit.MILLISECONDS);

	}

}
