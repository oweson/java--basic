package basic.ocean.A_threadpool.facotory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPoolProxy extends AbstractThreadPool{
	
	ThreadPoolExecutor mExecutor;
	// ֻ��Ҫһ�����������
	private int			mCorePoolSize;
	private int			mMaximumPoolSize;
	private long		mKeepAliveTime;

	/**
	 * ͨ�����췽�������Ӧ��corePoolSize,maximumPoolSize,keepAliveTime
	 */
	public ThreadPoolProxy(int corePoolSize, int maximumPoolSize, long keepAliveTime) {
		super();
		mCorePoolSize = corePoolSize;
		mMaximumPoolSize = maximumPoolSize;
		mKeepAliveTime = keepAliveTime;
	}

	private void initThreadPoolExecutor() {
		// ˫�ؼ�����
		if (mExecutor == null) {
			synchronized (ThreadPoolProxy.class) {
				if (mExecutor == null) {
					TimeUnit unit = TimeUnit.MILLISECONDS;
					BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
					ThreadFactory threadFactory = Executors.defaultThreadFactory();
					RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();
					mExecutor = new ThreadPoolExecutor(//
							mCorePoolSize,// �����߳���
							mMaximumPoolSize,// ����߳���
							mKeepAliveTime, // ����ʱ��
							unit, // ����ʱ��ĵ�λ
							workQueue,// ��������
							threadFactory,// �̹߳���
							handler// �쳣������
							);
				}
			}
		}
	}

	/**ִ������*/
	public void execute(Runnable task) {
		initThreadPoolExecutor();
		mExecutor.execute(task);
	}
	
	/**�ύ����*/
	@Override
	public Future<?> submit(Runnable task) {
		initThreadPoolExecutor();
		return mExecutor.submit(task);
	}

	/**�Ƴ�����*/
	public void remove(Runnable task) {
		initThreadPoolExecutor();
		mExecutor.remove(task);
	}


}
