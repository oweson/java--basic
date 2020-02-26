package com.lp.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GoodThreadExcuter extends Thread{

	int poolSize = 1;
	boolean isSynRun = true;
	Queue<Runnable> jobQueue;
	List<Thread> threadList = new ArrayList<Thread>();
	int aliveCount=0;
	int totalJobCount;
	
	public GoodThreadExcuter(int poolSize, boolean isSynRun, Queue<Runnable> jobQueue) {
		super();
		this.poolSize = poolSize;
		this.isSynRun = isSynRun;
		this.jobQueue = jobQueue;
		this.totalJobCount = jobQueue.size();
	}







	public void run() {
		//为了不阻塞主线程
		while(true){
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(aliveCount<poolSize){
				synchronized (this) {
					Thread thread = new Thread(jobQueue.poll());
					thread.start();
					threadList.add(thread);
				}
				aliveCount++;
			}
			//没有待分配任务
			if(jobQueue.size()==0){
				break;
			}
		
			
		}
		
	}








	
	

	
	
}
