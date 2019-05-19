package basic.ocean.thread.Runnable;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 19:45
 */
public class HelloRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new HelloRunable()).start();
        new Thread(new HelloRunable()).start();
    }
}
