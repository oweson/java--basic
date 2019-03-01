package eclipse.mar.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 21:11
 */
public class NoNameClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);

                }
            }
        }).start();
    }
}
