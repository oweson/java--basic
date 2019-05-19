package basic.pond.basic;


import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/4 0004 21:00
 */
public class UpChracterTest {
    public static void main(String[] args) {
        demo1();
    }
    public static final int demo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入.....");
        String nextLine = scanner.nextLine();
        char[] charArray = nextLine.toCharArray();
        char[] c = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                c[i] = charArray[i];

            }
        }
        System.out.println("大写字母有.....");
        StringBuilder sb   = new StringBuilder();
        for (char c1 : c) {
            sb.append(c1);

        }
        System.out.println(sb);
        return 9;
    }
}
