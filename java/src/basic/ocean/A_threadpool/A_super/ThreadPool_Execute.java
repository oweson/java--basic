package basic.ocean.A_threadpool.A_super;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����ִ���������õ�execute����������execute����������һ��submit����Ҳ����ִ�������ύ������
 * 
 * @author Peter execute�����ڲ���Ҫ��ע����ֵ�ĳ�����ֻ��Ҫ���̶߳����̳߳���ȥִ�оͿ�����
 */
public class ThreadPool_Execute {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		pool.execute(() -> System.out.println(Thread.currentThread().getName()
				+ "\t��ʼ�����ˡ���"));
	}
}
