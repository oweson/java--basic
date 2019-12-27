package basic.pond.eighttype;

import java.util.HashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/9 21:42
 */
public class Demo2Integer extends HashMap {
    static {
        System.out.println("static");
    }

    //Integer 是final修饰的；
    public static void main(String[] args) {
        System.out.println("main");
        new Demo2Integer().put(1, 1);
    }
}
