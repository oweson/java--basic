package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 我们执行任务是用的execute方法，除了execute方法，还有一个submit方法也可以执行我们提交的任务。
 * 
 * @author Peter execute适用于不需要关注返回值的场景，只需要将线程丢到线程池中去执行就可以了
 */
public class ThreadPool_Execute {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		pool.execute(() -> System.out.println(Thread.currentThread().getName()
				+ "\t开始发车了……"));
	}
}
