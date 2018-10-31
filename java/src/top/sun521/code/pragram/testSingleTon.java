package top.sun521.code.pragram;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/10 0010 7:25
 */
public class testSingleTon {
    public static void main(String[] args) {
        System.out.println(SingleTon.getInstance());
        System.out.println(SingleTon.getInstance());
        System.out.println(SingleTon01.getInstance());
        System.out.println(SingleTon01.getInstance());
    }
}
