package com.lp.thread;

import java.util.Queue;


public class GoodThreadPool {

	int poolSize;
	boolean isSynRun = true;
	Queue<Runnable> jobQueue;
	
	
	
	/**
	 * @param poolSize	线程池大小
	 * @param isSynRun	主线程是否阻塞
	 * @param jobQueue	所有任务的队列
	 */
	public GoodThreadPool(int poolSize, boolean isSynRun ,Queue<Runnable> jobQueue) {
		super();
		this.poolSize = poolSize;
		this.isSynRun = isSynRun;
		this.jobQueue = jobQueue;
	}
	
	
	public GoodThreadPool(int poolSize,Queue<Runnable> jobQueue) {
		super();
		this.poolSize = poolSize;
		this.isSynRun = false;
		this.jobQueue = jobQueue;
	}






	public void excute() throws InterruptedException{
		//验证
		if(null == jobQueue){
			throw new NullPointerException("jobQueue参数为空！");
		}
		if(poolSize < 1){
			throw new IllegalArgumentException("线程池大小设置不正确！");
		}
		
		GoodThreadExcuter goodThreadExcuter = new GoodThreadExcuter(poolSize, isSynRun, jobQueue);
		Thread excuter = new Thread(goodThreadExcuter);
		Thread protecter = new Thread(new GoodThreadPoolProtecter(goodThreadExcuter,this));
		protecter.setDaemon(true);
		excuter.start();
		protecter.start();
		
		if(isSynRun){
			synchronized (this) {
				this.wait();
			}
		}
		
		
	}
	
	
}
