package basic.sea.jvm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/19 0019 22:38
 */
public class Demo2 {
    public static void main(String[] args) {
        Object o = new Object();
        Demo2 demo2 = new Demo2();
        System.out.println(new Demo1().getClass().getClassLoader());
        System.out.println(o.getClass().getClassLoader());
        System.out.println(demo2.getClass().getClassLoader());
    }

}
