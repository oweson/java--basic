package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 19:51
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new T());
        Thread thread02 = new Thread(new T());
        thread.start();
        thread02.start();

    }
}
