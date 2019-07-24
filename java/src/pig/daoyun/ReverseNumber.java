package pig.daoyun;


import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/18 0018 16:24
 */
public class ReverseNumber {
    public static final void reverseNumber() {
        String s = "123";
        char[] toCharArray = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = toCharArray.length - 1; i >= 0; i--) {
            char c = toCharArray[i];
            sb.append(c);

        }
        System.out.println(new Integer(sb.toString()));

    }

    public static void main(String[] args) {
        reverseNumber();
        // 1 录入一个Integer字符串反转输出；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入......");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int length = chars.length - 1; length >= 0; length--) {
            char c = chars[length];
            sb.append(c);


        }
        System.out.println(new Integer(sb.toString()));
    }
}
