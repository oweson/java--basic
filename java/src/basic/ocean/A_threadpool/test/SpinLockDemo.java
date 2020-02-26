package basic.ocean.A_threadpool.test;

/**
 * 说明:自旋锁<br/>
 * 创建时间：2018年12月10日 下午11:07:03<br/>
 * @author hhl
 */
public class SpinLockDemo implements Runnable{
	static int sum;
	private SpinLock lock;

	public SpinLockDemo(SpinLock lock) {
		this.lock = lock;
	}

	public static void main(String[] args) throws InterruptedException {
		SpinLock lock = new SpinLock();
		for (int i = 0; i < 100; i++) {
			SpinLockDemo spinLockDemo = new SpinLockDemo(lock);
			Thread t = new Thread(spinLockDemo);
			t.start();
		}

		Thread.currentThread().sleep(1000);
		System.out.println(sum);
	}

	@Override
	public void run() {
		this.lock.lock();
		this.lock.lock();
		sum++;
		this.lock.unlock();
		this.lock.unlock();
	}
}
