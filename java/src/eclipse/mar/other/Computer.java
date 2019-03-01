package eclipse.mar.other;

import java.util.Scanner;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月10日 下午6:33:24
 * 类说明：侵权必究。。。。。。。
 */

public class Computer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int c;
        int d;
        int x = 1;
        while (x < 10000) {

            System.out.print("输入第一个数：");
            c = scan.nextInt();

            System.out.print("输入第二个数：");
            d = scan.nextInt();
            System.out.print("请选择算法：+ - * /");
            String str1 = scan.next();
            switch (str1) {
                case "+":
                    System.out.println(c + "+" + d + "=" + Computer.sum(c, d));
                    break;
                case "-":
                    System.out.println(c + "-" + d + "=" + Computer.sub(c, d));
                    break;
                case "*":
                    System.out.println(c + "*" + d + "=" + Computer.mul(c, d));
                    break;
                case "/":
                    System.out.println(c + "/" + d + "=" + Computer.div(c, d));
                    break;
                default:
                    System.out.println("输入的算法有误");
            }

            System.out.println("运算是否结束：exit enter");
            String str2;
            str2 = scan.next();
            switch (str2) {
                case "exit":
                    System.out.println("结束运算");
                    break;
                case "enter":
                    System.out.println("继续运算");
                    break;
                    default:
                        System.out.println();
            }
        }
    }

    static int sum(int a, int b) {
        int add;
        add = a + b;
        return add;

    }

    static int sub(int a, int b) {
        int jianfa;
        jianfa = a - b;
        return jianfa;

    }

    static int mul(int a, int b) {
        int chengFa;
        chengFa = a * b;
        return chengFa;

    }

    static int div(int a, int b) {
        int chuFa;
        chuFa = a / b;
        return chuFa;

    }

}
