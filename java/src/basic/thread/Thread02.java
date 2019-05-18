package basic.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:01
 */
public class Thread02 {


    public static void main(String[] args) throws InterruptedException {
        /**
         * 主线程和二另一个线程交互运行！取决于其他的*/
        // FIXME: 2018/6/22 0022


        new Pig().start();
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            System.out.println("hello");
        }

    }
}

class Pig extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("world");
        }
    }
}
