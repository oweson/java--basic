package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * �����Լ����̳߳��ˣ��������ArrayBlockingQueue�滻��LinkedBlockingQueue��ָ���˶��еĴ�С��
 * �����񳬳����д�С֮��ʹ��CallerRunsPolicy�ܾ����Դ����������ĺô����ϸ�����˶��еĴ�С���������һֱ�������������������
 * �е�ʱ��������ıȽ������������������ռ�ô����ڴ棬�����ڴ������ ��Ȼ��Ҳ�������ύ���̳߳ص���ڽ��п��ƣ�������CountDownLatch,
 * Semaphore��
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
