package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * �̳߳صľܾ����ԣ�CallerRunsPolicy:ֻҪ�̳߳�δ�رգ�
 * �ò���ֱ���ڵ������߳��У����е�ǰ�ı�����������
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
