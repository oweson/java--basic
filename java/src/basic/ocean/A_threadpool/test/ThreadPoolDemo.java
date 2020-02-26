package basic.ocean.A_threadpool.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ˵��:�̳߳����ִ�����ʽ<br/>
 * ����ʱ�䣺2018��12��3�� ����9:00:00<br/>
 * @author hhl
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//1.�ɻ�����̳߳�(���ظ�����)
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			int temp = i;
			newCachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("threadName:"+Thread.currentThread().getName()+",i:"+temp);
				}
			});
		}
		
		//2.�ɹ̶������̳߳�
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			int temp = i;
			newFixedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("threadName:"+Thread.currentThread().getName()+",i:"+temp);
				}
			});
		}
		
		//3.�ɶ�ʱ�̳߳�
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3);
		for (int i = 0; i < 10; i++) {
			int temp = i;
			newScheduledThreadPool.schedule(new Runnable() {
				@Override
				public void run() {
					System.out.println("threadName:"+Thread.currentThread().getName()+",i:"+temp);
				}
			},3,TimeUnit.SECONDS);
		}
		
		//4.���̳߳�
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			int temp = i;
			newSingleThreadExecutor.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("threadName:"+Thread.currentThread().getName()+",i:"+temp);
				}
			});
		}
		newSingleThreadExecutor.shutdown();
	}
}