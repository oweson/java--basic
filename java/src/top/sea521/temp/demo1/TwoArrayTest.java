package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:37
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr02 = {1, 2, 3, 4};
        int[] arr03 = {1, 2, 3, 4,5};
        boolean b = demo1(arr, arr02);
        boolean b1 = demo1(arr, arr03);
        System.out.println(b);
        System.out.println(b1);
    }

    private static boolean demo1(int[] arr, int[] arr02) {
        if (arr.length != arr02.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr02[i]) {
                return false;
            }

        }
        return true;
    }
}
