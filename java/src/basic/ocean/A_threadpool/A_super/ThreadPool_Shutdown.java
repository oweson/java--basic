package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * shutdown:�����ǵ���shutdown���̳߳ؽ����ٽ����µ����񣬵�Ҳ����ȥǿ����ֹ�Ѿ��ύ��������ִ���е�����
 *
 * @author Peter
 * ����ģ�����������е�״̬��Ȼ�����shutdown��������������������񣬿϶��Ǿܾ���ӵģ��뿴��������
 */
public class ThreadPool_Shutdown {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 5; i++) {
            System.err.println(i);
            pool.execute(() -> {
                try {
                    Thread.sleep(30000);
                    System.out.println("---");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(1000);
        pool.shutdown();
        // todo ���濪ʼ�쳣
        pool.execute(() -> {
            try {
                Thread.sleep(30000);
                System.out.println("----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-----");
        });
    }
}
