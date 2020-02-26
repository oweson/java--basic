package com.lp.thread;

import java.util.Iterator;
import java.util.List;

/**
 * 守护线程,负责aliveCount更新,主程序阻塞唤醒
 * @author admin
 *
 */
public class GoodThreadPoolProtecter extends Thread{

	GoodThreadExcuter goodThreadExcuter;
	GoodThreadPool goodThreadPool;
	
	public GoodThreadPoolProtecter(GoodThreadExcuter goodThreadExcuter, GoodThreadPool goodThreadPool) {
		super();
		this.goodThreadExcuter = goodThreadExcuter;
		this.goodThreadPool = goodThreadPool;
	}

	public void run() {
		while(true){
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (goodThreadExcuter) {
				List<Thread> threadList = goodThreadExcuter.threadList;
				Iterator<Thread> iterator = threadList.iterator();
				while(iterator.hasNext()){
					Thread t = iterator.next();
					if(!t.isAlive()){
						iterator.remove();
					}
				}
				int count = threadList.size();
				goodThreadExcuter.aliveCount = count;
				
				if(count == 0 && goodThreadExcuter.jobQueue.size()==0){
					//执行完毕唤醒主程序
					synchronized (goodThreadPool) {
						goodThreadPool.notifyAll();
						break;
					}
				}
			}
			
		}
		
	}

}
