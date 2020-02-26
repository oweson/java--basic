package basic.ocean.A_threadpool.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ˵��:������<br/>
 * ����ʱ�䣺2018��12��10�� ����9:40:00<br/>
 * @author hhl
 */
public class ReentrantLockDemo implements Runnable {
	ReentrantLock lock = new ReentrantLock();
	
	public void get() throws InterruptedException {
		lock.lock();
		System.out.println("name:" + Thread.currentThread().getName() + " get();");
		Thread.sleep(20);
		set();
		lock.unlock();
	}

	public void set() {
		System.out.println("name:" + Thread.currentThread().getName() + " set();");
	}

	@Override

	public void run() {
		try {
			get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ReentrantLockDemo ss = new ReentrantLockDemo();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
	new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();
		new Thread(ss).start();

	}
}
