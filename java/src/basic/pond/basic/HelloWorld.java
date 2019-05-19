package basic.pond.basic;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/17 0017 19:13
 */
public class HelloWorld {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println(1 / 1);
            String property = System.getProperty("java.version");
            String s = System.getProperty("java.home");
            System.out.println(property);
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException("saa");
        } finally {
            // 代表总是运行；
            System.out.println("finally");
        }
    }
}