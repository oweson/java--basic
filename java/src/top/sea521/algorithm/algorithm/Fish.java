package top.sea521.algorithm.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/22 0022 9:55
 */
public class Fish {
    public static final int demo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * demo1(n - 1);
    }

    public static void main(String[] args) {
        // f(n) = n * f(n-1)
        int i = demo1(9);
        System.out.println(i);

    }
}
