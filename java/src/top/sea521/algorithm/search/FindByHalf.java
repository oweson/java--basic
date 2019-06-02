package top.sea521.algorithm.search;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 14:39
 */
public class FindByHalf {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;

        }
        int i = BinarySearch(arr, 8);
        System.out.println(i);

    }

    public static int BinarySearch(int[] sz, int key) {
        int low = 0;
        int high = sz.length - 1;
        //  0-9    6-9   7-9  8
        while (low <= high) {
            int middle = (low + high) / 2;
            /** 1 二分一下子找到了！返回！*/
            if (sz[middle] == key) {
                return middle;
            } else if (sz[middle] > key) {
                /**小于中间数字在左边！*/
                high = middle - 1;
            } else {
                /**大于中间的数字在右边*/
                low = middle + 1;
            }
        }
        return -1;
    }
}
