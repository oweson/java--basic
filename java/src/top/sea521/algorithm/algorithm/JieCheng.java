package top.sea521.algorithm.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/21 0021 19:46
 */
public class JieCheng {
    public static final int demo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n *demo1(n - 1);

    }

    public static void main(String[] args) {
        int i = demo1(6);
        System.out.println(i);

    }
}
