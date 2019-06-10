package top.sea521.algorithm.digui;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/9 10:49
 */
public class Demo1Digui {
    private static int demo1(int i) {
        if (i == 1) {
            return 1;
        }
        return i * demo1(i - 1);
    }

    public static void main(String[] args) {
        int i = demo1(9);
        System.out.println(i);
    }
}
