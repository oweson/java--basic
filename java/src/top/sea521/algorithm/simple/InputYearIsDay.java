package top.sea521.algorithm.simple;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 15:16
 */
public class InputYearIsDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入year：");
        int year = scanner.nextInt();
        System.out.println("输入month：");
        int month = scanner.nextInt();
        System.out.println("输入day：");
        int day = scanner.nextInt();
        int sumDay = 0;
        /** 1 判断月1，3，5，7，8，10，12 31天*/
        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                /** 2 判断年份是闰年还是*/
                //todo 未完？？？
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    sumDay += 29;
                else
                    sumDay += 28;
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;

        }
        System.out.println(year + "年" + month + "月" + day + "日是今年的第" + sumDay
                + "天");
    }
}
