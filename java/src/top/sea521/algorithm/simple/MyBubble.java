package top.sea521.algorithm.simple;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/21 0021 10:40
 */
public class MyBubble {
    public static void bubble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字！！！逗号隔开");
        String string = scanner.nextLine();
        String[] split = string.split(",");
        /**声明存储的数组的长度*/
        int arr[] = new int[split.length];
        int i = 0;
        for (String s : split) {
            int number = Integer.parseInt(s);
            arr[i] = number;
            i++;

        }
        System.out.println("排序前是：");
        for (int i1 : arr) {
            System.out.println(i1);

        }
        /**开始排序！*/
        for (int i1 = 0; i1 < arr.length-1; i1++) {
            for (int i2 = 0; i2 < arr.length-i-1; i2++) {
                if(arr[i2]>arr[i2+1]){
                    int temp=arr[i2];
                    arr[i2]=arr[i2+1];
                    arr[i2+1]=temp;
                }

            }

        }
        System.out.println("排序后是：");
        for (int i1 : arr) {
            System.out.println(i1);

        }

    }

    public static void main(String[] args) {
        bubble();

    }
}
