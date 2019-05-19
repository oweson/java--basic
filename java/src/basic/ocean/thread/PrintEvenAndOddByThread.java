package basic.ocean.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/25 0025 10:25
 */
public class PrintEvenAndOddByThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("我是偶数：" + i);
            }

        }

    }

    public static void main(String[] args) {
        PrintEvenAndOddByThread thread = new PrintEvenAndOddByThread();
        thread.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                //i%2==1
                System.out.println("我是基数：" + i);
            }

        }

    }
}
