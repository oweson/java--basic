package basic.pond.nangchang;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/23 0023 23:48
 */
public class JieCheng {
    public static final int demo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * demo1(n - 1);
    }

    public static void main(String[] args) {
        int i = demo1(5);
        System.out.println(i);


    }
}
