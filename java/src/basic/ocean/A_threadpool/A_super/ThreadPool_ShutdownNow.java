package basic.ocean.A_threadpool.A_fourthread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * shutdownNow:对正在执行的任务全部发出interrupt(),停止执行，对还未开始执行的任务全部取消，
 * 并返回还没有开始执行任务的列表
 * 代码模拟了立即取消的场景，往线程池里添加5个线程任务，然后sleep一段时间，线程池只有一个线程，
 * 如果此时调用shutdownNow后应该需要中断一个正在执行的任务
 * 和返回4个还未执行的任务，控制台输出下面的内容：
 */
public class ThreadPool_ShutdownNow {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 5; i++) {
			System.err.println(i);
			pool.execute(() -> {
				try {
					Thread.sleep(30000);
					System.out.println("--");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("---");
			});
		}
		Thread.sleep(1000);
		List<Runnable> runs = pool.shutdownNow();
		for (int i = 0; i < runs.size(); i++) {
			System.out.println(runs.get(i));
		}
	}
}
