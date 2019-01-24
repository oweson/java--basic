package eclipse.mar.math;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 21:31
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入字符串......");
        String nextLine = sc.nextLine();
        System.out.println("反转后......");
        reverseString(nextLine);

    }

    private static void reverseString(String nextLine) {
        StringBuilder sb = new StringBuilder();
        char[] toCharArray = nextLine.toCharArray();
        for (int i = toCharArray.length - 1; i >= 0; i--) {
            sb.append(toCharArray[i]);

        }
        System.out.println(sb);
    }
}
