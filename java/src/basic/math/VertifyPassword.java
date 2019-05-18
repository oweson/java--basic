package basic.math;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/26 0026 16:00
 */
public class VertifyPassword {
    public static void main(String[] args) {
        /** 1 - - 必须至少8个字符。
         - 必须至少2个大写字符。
         - 必须只有字母和数字。
         - 代码实现，效果如图所示
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入密码......");
        String nextLine = sc.nextLine();
        boolean b = vertifyPassword(nextLine);
        System.out.println(b);
    }

    private static boolean vertifyPassword(String nextLine) {
        if (nextLine.length() < 8) {
            return false;
        }
        char[] toCharArray = nextLine.toCharArray();
        int count = 0;

        for (int i = 0; i < toCharArray.length; i++) {
            char c = toCharArray[i];
            if (c > 'A' && c < 'Z') {
                count++;
            }
            /**字母数字*/
            if ((c < '0' || c > '9') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                return false;
            }


        }
        if (count < 2) {
            return false;
        }


        return true;
    }
}
