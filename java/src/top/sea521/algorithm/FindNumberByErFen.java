package top.sea521.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/21 0021 11:02
 */
public class FindNumberByErFen {
    /** 1 二分查找的效率很高，折办查找，每次缩小一半的查找范围*/
    /**
     * 2 前提有序
     */
    public static int bigSearch(int[] arr, int number) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            /** 1 直接找到啦*/
            if (arr[mid] == number) {
                return mid + 1;
                /** 2 在后半部分*/
            } else if (arr[mid] < number) {
                lo = mid + 1;
            } else {
                /** 3 在前半部分*/
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 9};
        int i = bigSearch(arr, 9);
        System.out.println(i);
    }

}
