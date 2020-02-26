package basic.ocean.A_threadpool.A_fourthread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * shutdownNow:������ִ�е�����ȫ������interrupt(),ִֹͣ�У��Ի�δ��ʼִ�е�����ȫ��ȡ����
 * �����ػ�û�п�ʼִ��������б�
 * ����ģ��������ȡ���ĳ��������̳߳������5���߳�����Ȼ��sleepһ��ʱ�䣬�̳߳�ֻ��һ���̣߳�
 * �����ʱ����shutdownNow��Ӧ����Ҫ�ж�һ������ִ�е�����
 * �ͷ���4����δִ�е����񣬿���̨�����������ݣ�
 */
public class ThreadPool_ShutdownNow {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 5; i++) {
			System.err.println(i);
			pool.execute(() -> {
				try {
					Thread.sleep(30000);
					System.out.println("--");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("---");
			});
		}
		Thread.sleep(1000);
		List<Runnable> runs = pool.shutdownNow();
		for (int i = 0; i < runs.size(); i++) {
			System.out.println(runs.get(i));
		}
	}
}
