package classic.onehundred;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/19 0019 18:32
 */
public class JieCheng {
    public static void demo1() {
        int sum = 0;
        int mul = 1;
        for (int i = 1; i < 3; i++) {
            /**进来从新为1*/
            mul = 1;
            for (int j = 1; j <= i; j++) {
                mul *= j;
            }
            System.out.println(mul);

            sum = mul + sum;
        }
        System.out.println(sum + "-------------------");
        /**编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和*/
    }

    public static void main(String[] args) {
        JieCheng.demo1();
        int sum = 1;
        for (int i = 1; i < 11; i++) {
            sum *= i;

        }
        System.out.println(sum);
    }
}
