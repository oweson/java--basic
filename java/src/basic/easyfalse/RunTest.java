package basic.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/1 0001 13:47
 */
public class RunTest {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                pong();

            }
        };
        thread.run();
        System.out.println("ping");

    }

    static void pong() {
        System.out.println("pong");
    }
    // pong
    //ping

}
