package top.sea521.algorithm;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/4 0004 14:44
 */
public class Demo2InputNumberToSum {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入数字，代表数字的大小");
        int i = Integer.parseInt(sc.nextLine().trim());
        System.out.println("里输入的是" + i);
        int arr[] = new int[i];
        /**读到的数字*/
        String[] split = sc.nextLine().split(" ");
        /**读到的可能是两位......不确定*/
        for (int i1 = 0; i1 < i; i1++) {
            int i2 = Integer.parseInt(split[i1].trim());
            arr[i1] = i2;
        }
        int i1 = sumArray(arr);
        System.out.println("sum is" + i1);

    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }
}
