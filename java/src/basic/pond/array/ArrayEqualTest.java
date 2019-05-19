package basic.pond.array;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/1 0001 22:34
 */
public class ArrayEqualTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr02 = {1, 2, 3, 4, 5, 6, 7};
        boolean b = demo1(arr, arr02);
        System.out.println(b);
        /** 1 比较两个数组是否相等，第一：长度，第二：每一个的元素；*/
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
