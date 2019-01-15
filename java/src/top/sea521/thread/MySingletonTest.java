package top.sea521.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 14:40
 */
public class MySingletonTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getMySingleton();
        MySingleton mySingleton02 = MySingleton.getMySingleton();
        System.out.println(mySingleton==mySingleton02);
        System.out.println(mySingleton);
        System.out.println(mySingleton02);
    }
}
