package top.sea521.design.creational.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 19:51
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println("threadLocal test!");
        Demo5ThreadLocal instance = Demo5ThreadLocal.getInstance();
        Demo5ThreadLocal instance02 = Demo5ThreadLocal.getInstance();
        System.out.println(instance);
        System.out.println(instance02);
        Runtime.getRuntime();


    }
}
