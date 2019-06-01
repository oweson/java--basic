package top.sea521.algorithm.search;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/7 0007 21:07
 */
public class BinarySearch {
    public static void main(String[] args) {
        /** 1 二分查找也称折半查找（Binary Search），它是一种效率较高的查找方法。
         * 但是，折半查找要求线性表必须采用顺序存储结构，而且表中元素按关键字有序排列。
         *  二分查找的效率很高，折办查找，每次缩小一半的查找范围前提有序
         ***/
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        int i = demo1(arr, 99);
        System.out.println(i);
    }

    private static int demo1(int[] arr, int i) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (arr[middle] == i) {
                return middle;
            } else if (arr[middle] < i) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

        }
        return -1;

    }
}
