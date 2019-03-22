package eclipse.mar.javase.lambda.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 16:37
 */
public class PrintNumber {
    private int start = 1;
    private int end = 99;

    public static void main(String[] args) {
        new PrintNumber().method();
    }

    private void method() {
        Runnable runnable = () -> {
            for (int i = start; i < end; i++) {
                System.out.println(i);
            }

        };
        Thread t = new Thread(runnable);
        t.start();
    }
}
