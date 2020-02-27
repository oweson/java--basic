package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DiscardOldestPolicy:�ò��Խ��������ϵ�һ������
 * Ҳ���Ǽ�����ִ�е����񣬲������ٴ��ύ��ǰ����
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
