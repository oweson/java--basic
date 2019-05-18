package basic.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 11:56
 */
public class ThreadLambdaTest {
    public void demo1() {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

            }
        };
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        new ThreadLambdaTest().demo1();


    }
}
