package top.sea521.temp.demo1;

/**
 * @author oweson
 * @date 2020/10/22 14:31
 */


public class DiGuiTest {
    public static final int digui(int n) {
        if (n == 1) {
            return 1;

        }
        return digui(n - 1) + n;

    }

    public static void main(String[] args) {
        System.out.println(digui(3));
    }
}
