package top.sun521.oweson;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/11 0011 11:59
 */
public class TestDebugg {
    public static void main(String[] args) {
        int sum = getSum();
        for (int i = getSum(); i < 1000; i++) {
            sum+=i;

        }
        System.out.println(sum);
    }

    private static int getSum() {
        return 0;
    }
}
