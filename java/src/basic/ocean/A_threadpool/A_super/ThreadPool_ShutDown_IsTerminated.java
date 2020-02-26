package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * һЩҵ�񳡾�����Ҫ֪���̳߳��е������Ƿ�ȫ��ִ����ɣ������ǹر��̳߳�֮��
 * ������isTerminated���ж����е��߳��Ƿ�ִ����ɣ�
 * ǧ��Ҫ��isShutdown��isShutdownֻ�Ƿ������Ƿ���ù�shutdown�Ľ����
 */
public class ThreadPool_ShutDown_IsTerminated {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			System.err.println(i);
			pool.execute(() -> {
				try {
					Thread.sleep(3000);
					System.out.println("--");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		Thread.sleep(1000);
		pool.shutdown();
		while(true){
			if(pool.isTerminated()){
				System.out.println("���е����̶߳�������");
				break;
			}
			Thread.sleep(1000);
		}
	}
}
