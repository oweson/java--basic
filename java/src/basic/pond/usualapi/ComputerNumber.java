package basic.pond.usualapi;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/14 20:08
 */
public class ComputerNumber {
    public static final void add() {
        int result = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入两个相加的数字,输入886就停止！！！：........");
            int firstNumber = sc.nextInt();
            if (firstNumber == 886) {
                break;
            }
            System.out.println("请输入第二个：......");
            int secondNumber = sc.nextInt();
            result = firstNumber + secondNumber;
            System.out.println("结果是：   " + result);
        }
    }

    public static final void multi() {
        int result = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入两个相乘的数字,输入886就停止！！！：........");
            int firstNumber = sc.nextInt();
            if (firstNumber == 886) {
                break;
            }
            System.out.println("请输入第二个：......");
            int secondNumber = sc.nextInt();
            result = firstNumber * secondNumber;
            System.out.println("结果是：   " + result);
        }
    }

    public static void main(String[] args) {
        add();
        multi();

    }
}
