package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DiscardPolicy���ò���ĬĬ�Ķ����޷���������񣬲������κδ���
 *
 * @author Peter
 */
public class DiscardPolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

    }
}
