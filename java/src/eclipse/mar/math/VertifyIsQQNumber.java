package eclipse.mar.math;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 21:42
 */
public class VertifyIsQQNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待验证的qq号码......");
        String nextLine = sc.nextLine();
        boolean b = IsQQNumber(nextLine);
        if (b) {
            System.out.println("是合法的qq号码" + nextLine);
        } else {
            System.out.println("不是合法的QQ" + nextLine);
        }
    }

    private static boolean IsQQNumber(String nextLine) {
        /**- 必须是5—12位数字。
         - 0不能开头。
         - 其他的必须是0-9的数字
         */

        if (nextLine.length() < 5 || nextLine.length() > 12) {
            return false;
        }
        if (nextLine.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < nextLine.length(); i++) {
            char charAt = nextLine.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;

    }

}
