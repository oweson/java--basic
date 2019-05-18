package basic.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/25 0025 10:34
 */
public class PrintThreadNameAndMainThreadName implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + "我是runnbable的");
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        new Thread(new PrintThreadNameAndMainThreadName()).start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "main");

            }

        }
    }
}
