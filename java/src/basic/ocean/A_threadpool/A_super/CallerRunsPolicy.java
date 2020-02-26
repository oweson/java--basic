package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池的拒绝策略：CallerRunsPolicy:只要线程池未关闭，
 * 该策略直接在调用者线程中，运行当前的被丢弃的任务
 *
 * @author Peter
 */
public class CallerRunsPolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        if (!e.isShutdown()) {
            r.run();
        }
    }
}
