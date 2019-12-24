package basic.ocean.thread.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:01
 */
public class Demo3Thread {


    public static void main(String[] args) throws InterruptedException {
        /**
         * 主线程和二另一个线程交互运行！取决于其他的*/
        // FIXME: 2018/6/22 0022


        new Pig().start();
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            System.out.println("hello");
            System.out.println(Thread.currentThread().getName());
        }

    }
}

class Pig extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("world");
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
