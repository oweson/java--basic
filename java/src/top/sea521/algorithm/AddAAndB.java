package top.sea521.algorithm;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/4 0004 14:22
 */
public class AddAAndB {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input ......");
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            int i1 = scanner.nextInt();
            System.out.println(i + i1);
        }
    }
}
