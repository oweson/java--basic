package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池的拒绝策略：AbortPolicy：该策略会直接抛出异常，阻止系统正常工作
 * 
 * @author Peter
 * 
 */
public class AbortPolicy implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
		throw new RejectedExecutionException("Task" + r.toString()
				+ "rejected from" + e.toString());
	}
}
