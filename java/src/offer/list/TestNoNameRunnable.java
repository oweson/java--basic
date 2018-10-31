package offer.list;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/21 0021 16:59
 */
public class TestNoNameRunnable {
    public static void testThread() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                //super.run();
                System.out.println("hello");
            }
        };
        thread.start();
    }

    public static void main(String[] args) {
        TestNoNameRunnable.testThread();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i += 3) {
                    System.out.println(i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
