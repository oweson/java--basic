package basic.pond.string;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/4 0004 11:01
 */
public class StringSwap {
    public static String str = "pig";

    public static void demo1(String str) {
        str = "world";
    }

    public static void main(String[] args) {
        System.out.println(str);
        String ppx = "hello";
        // string is special is immutable;
        demo1(ppx);
        System.out.println(ppx);

    }
}
