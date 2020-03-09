package basic.ocean.thread.wait;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/6 17:06
 */
public class MainTest {
    public static void main(String[] args) {
        new Thread(new Rabbit01()).start();
        new Thread(new Rabbit02()).start();

    }
}
