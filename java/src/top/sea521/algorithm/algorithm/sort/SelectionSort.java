package top.sea521.algorithm.algorithm.sort;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 15:00
 */
public class SelectionSort {


    public static void main(String[] args) {
        int[] arr={1,199,21,900,23,100};
         sort(arr);
    }
    public static  void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0, k = 0; i < len; i++, k = i) {
            // 在这一层循环中找最小,arr.length次循环；
            for (int j = i + 1; j < len; j++) {
                // 如果后面的元素比前面的小，那么就交换下标，每一趟都会选择出来一个最小值的下标
                if (arr[k] > arr[j]) {
                    k = j;
                }
            }

            if (i != k) {
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
            }
        }
    }

}
