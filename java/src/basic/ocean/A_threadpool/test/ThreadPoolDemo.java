package basic.ocean.A_threadpool.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 说明:线程池四种创建方式<br/>
 * 创建时间：2018年12月3日 下午9:00:00<br/>
 * @author hhl
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//1.可缓存的线程池(可重复利用)
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
		
		//2.可固定长度线程池
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
		
		//3.可定时线程池
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
		
		//4.单线程池
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