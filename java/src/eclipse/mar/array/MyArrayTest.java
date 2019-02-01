package eclipse.mar.array;

import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/30 0030 19:52
 */
public class MyArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr02 = {1, 2, 3, 4, 9, 2, 1};
        boolean b = demo1(arr);
        boolean b1 = demo1(arr02);
        System.out.println(Arrays.toString(arr)+"是"+b);
        System.out.println(Arrays.toString(arr02)+"是"+b1);
    }

    private static boolean demo1(int[] arr) {

        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            if (arr[start] != arr[end]) {
                return false;
            }

        }
        return true;
    }
}
