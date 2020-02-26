package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 定义自己的线程池了，我这边用ArrayBlockingQueue替换了LinkedBlockingQueue，指定了队列的大小，
 * 当任务超出队列大小之后使用CallerRunsPolicy拒绝策略处理。这样做的好处是严格控制了队列的大小，不会出现一直往里面添加任务的情况，
 * 有的时候任务处理的比较慢，任务数量过多会占用大量内存，导致内存溢出。 当然你也可以在提交到线程池的入口进行控制，比如用CountDownLatch,
 * Semaphore等
 * 
 * @author Peter
 * 
 */
public class ThreadPool_Custom {

	private static ExecutorService executorService = newFixedThreadPool(50);

	private static ExecutorService newFixedThreadPool(int nThreads) {

		return new ThreadPoolExecutor(nThreads, nThreads, 0L,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10000),
				new DefaultThreadFactory(), new CallerRunsPolicy());
	}

	public static void execute(Runnable command) {
		executorService.execute(command);
	}

	public static void shutdown() {
		executorService.shutdown();
	}

	static class DefaultThreadFactory implements ThreadFactory {
		private static final AtomicInteger poolNumber = new AtomicInteger(1);
		private final ThreadGroup group;
		private final AtomicInteger threadNumber = new AtomicInteger(1);
		private final String namePrefix;

		DefaultThreadFactory() {
			SecurityManager s = System.getSecurityManager();
			group = (s != null) ? s.getThreadGroup() : Thread.currentThread()
					.getThreadGroup();
			namePrefix = "FSH-pool-" + poolNumber.getAndIncrement()
					+ "-thread-";
		}

		public Thread newThread(Runnable r) {
			Thread t = new Thread(group, r, namePrefix
					+ threadNumber.getAndIncrement(), 0);
			if (t.isDaemon())
				t.setDaemon(false);
			if (t.getPriority() != Thread.NORM_PRIORITY)
				t.setPriority(Thread.NORM_PRIORITY);
			return t;
		}
	}
}
