package basic.ocean.A_threadpool.A_fourthread;/*package com.threadpool.demo01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import sun.rmi.runtime.Log;

/**
 * Spring integration�о���һ���Զ���ľܾ�����CallerBlocksPolicy����������뵽�����У�ֱ���������п��в�����ɹ���ʱ��
 * ���򽫸������ȴ�ʱ��һֱ������ֱ����ʱ��
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

//�����֮�����ʹ���أ��ⶨ��û�õ�ѽ��һ��Ҫ�õ��̳߳���ѽ������ͨ������ķ�ʽ�Զ����̳߳أ�ָ���ܾ����ԡ�
//BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
//ThreadPoolExecutor executor = new ThreadPoolExecutor(
//    10, 100, 10, TimeUnit.SECONDS, workQueue, new CallerBlocksPolicy());*/