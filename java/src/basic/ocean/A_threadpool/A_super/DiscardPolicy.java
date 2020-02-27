package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DiscardPolicy：该策略默默的丢弃无法处理的任务，不予以任何处理
 *
 * @author Peter
 */
public class DiscardPolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

    }
}
