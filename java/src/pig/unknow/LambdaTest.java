package pig.unknow;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/6 0006 23:11
 */
public class LambdaTest implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("a");
        }).start();
        new Thread(new LambdaTest()).start();
    }

}
