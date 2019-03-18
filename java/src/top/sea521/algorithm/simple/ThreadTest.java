package top.sea521.algorithm.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/2 0002 19:54
 */
public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 11; i < 20; i++) {
            System.out.println(i);

        }
        new Thread(new Pig()).start();
        new Thread(new Pig()).start();

    }
}
class Pig implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+"hello");

        }
    }
}
