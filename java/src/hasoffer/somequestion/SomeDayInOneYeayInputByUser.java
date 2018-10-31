package hasoffer.somequestion;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/12 0012 17:45
 */
public class SomeDayInOneYeayInputByUser {
    /**
     * 用户输入一个日期，得到是哪一天
     */
    public static void main(String[] args) {
        int year, month, day, a = 0, b = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入年..........");
        year = reader.nextInt();
        System.out.println("请输入月.....");
        month = reader.nextInt();
        System.out.println("请输入天.........");
        day = reader.nextInt();
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    a = 31;
                    break;
                case 2:
                    /**判断闰年和平年的情况*/
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        a = 29;

                    } else {
                        a = 28;
                        break;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    a = 30;
                    break;
            }
            b = b + a;

        }
        /**1-6月  day是这个月的天数*/
        b = b + day;
        System.out.println("这是这一年的第" + b + "天");


    }
}
