package acm.suanfa;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/5 0005 11:35
 */
public class ErWeiArray {
    public static final void demo2() {
        int[][] aa = new int[6][6];
        System.out.println(aa.length + "=================");
    }

    private static void addErWeiArrAySum(int[][] arr) {
        int sum = 0;
        System.out.println(arr.length + "-------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }

        }
        System.out.println(sum);

    }

    /**
     * java.util.Scanner.skip(Pattern pattern) 方法跳过输入相匹配的指定模式，在忽略分隔符。
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        demo2();
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            /**重要的模式匹配*/
            System.out.println("input.........");
            String[] split = sc.nextLine().split(" ");
            // sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int i1 = Integer.parseInt(split[j]);
                arr[i][j] = i1;

            }


        }
        System.out.println("打印二位数组的和");
        addErWeiArrAySum(arr);

    }
}
