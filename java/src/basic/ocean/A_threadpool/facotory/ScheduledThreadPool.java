package basic.ocean.A_threadpool.facotory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	
	private ScheduledExecutorService scheduledThreadPool;
	
	private Map<String, Future> futureMap = new HashMap<>();
	
	public ScheduledThreadPool(int scheduledPoolSize){
		scheduledThreadPool = Executors.newScheduledThreadPool(scheduledPoolSize);
	}

	//循环执行
	public void executeCycle(Runnable runnable, int delay, int period, String tag){
		Future future = this.scheduledThreadPool.scheduleAtFixedRate(runnable, delay, period, TimeUnit.MILLISECONDS);
	    futureMap.put(tag, future);
	}

	//默认的循环执行,1秒执行一次
	public void defaultExecuteCycle(Runnable runnable){
		Future future = this.scheduledThreadPool.scheduleAtFixedRate(runnable,0,1000, TimeUnit.MILLISECONDS);
		futureMap.put(runnable.getClass().getName(),future);
	}

	//延迟执行
	public void executeDelay(Runnable runnable, int delay){
		this.scheduledThreadPool.schedule(runnable,delay, TimeUnit.MILLISECONDS);
	}

	//是否在线程池中执行
	public boolean isRunningInPool(String tag){
		if(futureMap.get(tag)!=null){
			return true;
		}else{
			return false;
		}
	}
	
	public void stopTask(String tag){
		Future future = this.futureMap.get(tag);
		if(future != null){
			future.cancel(true);
			futureMap.remove(tag);
		}
	}

	public void shutDown(){
		if(!scheduledThreadPool.isShutdown()) {
			this.scheduledThreadPool.shutdown();
		}
	}
}
