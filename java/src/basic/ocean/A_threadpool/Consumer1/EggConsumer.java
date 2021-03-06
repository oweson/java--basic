package basic.ocean.A_threadpool.Consumer1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程 放鸡蛋 取鸡蛋
 * 阻塞队列详解
 * <p>
 * http://blog.csdn.net/qq_23359777/article/details/70146778
 */
public class EggConsumer {

    private static final ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(10);

    public static void main(String[] args) {

        try {
            // 1 放鸡蛋
            putEgg();
            Thread.sleep(2000);
            // 2 取鸡蛋
            getEgg();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 多线程放鸡蛋
     */
    public static void putEgg() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        //ExecutorService fixedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i <= 15; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> {
                try {
                    Boolean b = abq.offer("" + index);
                    System.out.println("放入鸡蛋" + index + "====" + b);
                    //Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

    }

    /**
     * 多线程取鸡蛋
     */
    public static void getEgg() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        //ExecutorService fixedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i <= 30; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> {
                try {
                    String s = abq.poll();
                    System.err.println("取出鸡蛋" + s);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
