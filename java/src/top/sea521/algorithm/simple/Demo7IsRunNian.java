package top.sea521.algorithm.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/29 0029 19:43
 */
public class Demo7IsRunNian {

    /**
     * 闰年：普通年（不能被100整除的年份）能被4整除的为闰年。（如2004年就是闰年,1999年不是闰年）；
     * 世纪年（能被100整除的年份）能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)；
     */

    public static void main(String[] args) {
        isRunnNian(2004);

    }

    private static void isRunnNian(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
