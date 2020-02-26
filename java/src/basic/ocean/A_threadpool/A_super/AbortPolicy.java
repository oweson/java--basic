package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * �̳߳صľܾ����ԣ�AbortPolicy���ò��Ի�ֱ���׳��쳣����ֹϵͳ��������
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
