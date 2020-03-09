package basic.ocean.A_threadpool.A_super.b.Thread_4;

import java.util.concurrent.*;

public class FutureTest_1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�����з���һ��callable������ֵΪint
		FutureTask<Integer> task = new FutureTask<>(()->{
			TimeUnit.MILLISECONDS.sleep(500);
			return 1000;
		});
		
		new Thread(task).start();
		
		System.out.println(task.get());
		//����������ֱ������ִ����ɲ�ִ��
		
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		//ͨ��submit��callable�����߳���ִ�в�����futre���ͽ��
		Future<Integer> future = service.submit(()->{
			TimeUnit.MILLISECONDS.sleep(500);
			return 1;
		});
		
		System.out.println(future.isDone());
		//�ж������Ƿ�ִ����
		System.out.println(future.get());
		System.out.println(future.isDone());
		service.shutdown();
	}
}