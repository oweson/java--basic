package basic.utils;

import java.util.Scanner;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月19日 上午8:53:10 类说明：侵权必究。。。。。。。
 */

public class Demo2HideNameTest {

    public static String getAnonymousName(String name) {
        if (null == name) {
            return null;
        }

        if (name.length() <= 1) {
            return "*";
        }

        if (name.length() == 2) {
            return name.substring(0, 1) + "*";
        }

        char[] cs = name.toCharArray();
        for (int i = 1; i < cs.length - 1; i++) {
            // 隐藏除了首字母和尾部字母的所有字符；
            cs[i] = '*';
        }
        return new String(cs);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字......");
        String nextLine = sc.nextLine();
        String anonymousName = getAnonymousName(nextLine);
        System.out.println(anonymousName);

    }

}
