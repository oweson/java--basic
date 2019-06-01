package top.sea521.algorithm.simple;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/1 0001 15:44
 */
public class Demo3ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入..........");
        String nextLine = sc.nextLine();
        System.out.println("反转前是：" + nextLine);
        reverseString(nextLine);
        /**工具类*/
    }

    private static void reverseString(String nextLine) {
        String s = "";
        char[] toCharArray = nextLine.toCharArray();
        /**下标是0开始的，一定要减去1！！！
         * length大于等于0,0表示最后一个字符！！！*/
        for (int length = toCharArray.length - 1; length >= 0; length--) {
            s += toCharArray[length];


        }
        System.out.println("反转后是：" + s);
    }
}
