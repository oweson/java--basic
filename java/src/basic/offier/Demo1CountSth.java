package basic.offier;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/18 0018 21:21
 */
public class Demo1CountSth {
    public static void main(String[] args) {
        int a = 0, b = 0;
        /**ad代表正数的个数，b代表负数的个舒服*/
        /**统计输入的正数和负数，输入0程序停止*/
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字...............");
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else if (i > 0) {
                a = a + 1;
            } else {
                b += 1;
            }

        }
        System.out.println("正数有" + a + "负数有" + b);
    }
}
