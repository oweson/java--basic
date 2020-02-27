package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DiscardOldestPolicy:该策略将丢弃最老的一个请求，
 * 也就是即将被执行的任务，并尝试再次提交当前任务
 *
 * @author Peter
 */
public class DiscardOldestPolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        if (!e.isShutdown()) {
            e.getQueue().poll();
            e.execute(r);
        }
    }
}
