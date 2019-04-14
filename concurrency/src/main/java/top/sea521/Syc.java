package top.sea521;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 9:30
 */
public class Syc {
    public void test01() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

            }
        }
    }

    /**
     * 修饰方法
     */
    public synchronized void test02() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);

                }
            }
        }).start();
        ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(->System.out.println(100));

    }
}
