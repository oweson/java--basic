package basic.ocean.A_threadpool.A_fourthread;/*package com.threadpool.demo01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import sun.rmi.runtime.Log;

/**
 * Spring integration中就有一个自定义的拒绝策略CallerBlocksPolicy，将任务插入到队列中，直到队列中有空闲并插入成功的时候，
 * 否则将根据最大等待时间一直阻塞，直到超时。
 * 
 * @author Peter
 * 
 

//public class CallerBlocksPolicy implements RejectedExecutionHandler {
//
//	private static final Log logger = LogFactory.getLog(CallerBlocksPolicy.class);
//	private final long maxWait;
//
//	/**
//	 * @param maxWait
//	 *  The maximum time to wait for a queue slot to be available, in
//	 *   milliseconds.
//	 */
//	public CallerBlocksPolicy(long maxWait) {
//		this.maxWait = maxWait;
//	}
//
//
//	@Override
//	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//		if (!executor.isShutdown()) {
//			try {
//				BlockingQueue<Runnable> queue = executor.getQueue();
//				if (logger.isDebugEnabled()) {
//					logger.debug("Attempting to queue task execution for "
//							+ this.maxWait + " milliseconds");
//				}
//				if (!queue.offer(r, this.maxWait, TimeUnit.MILLISECONDS)) {
//					throw new RejectedExecutionException(
//							"Max wait time expired to queue task");
//				}
//				if (logger.isDebugEnabled()) {
//					logger.debug("Task execution queued");
//				}
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				throw new RejectedExecutionException("Interrupted", e);
//			}
//		} else {
//			throw new RejectedExecutionException("Executor has been shut down");
//		}
//	}
//
//}

//定义好之后如何使用呢？光定义没用的呀，一定要用到线程池中呀，可以通过下面的方式自定义线程池，指定拒绝策略。
//BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
//ThreadPoolExecutor executor = new ThreadPoolExecutor(
//    10, 100, 10, TimeUnit.SECONDS, workQueue, new CallerBlocksPolicy());*/