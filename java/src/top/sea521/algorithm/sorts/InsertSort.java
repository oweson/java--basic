package top.sea521.algorithm.sorts;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 20:56
 */
public class InsertSort {
    /** 1 插入排序；
     * 是稳定的排序方法*/
    public static void selectionSort(int[] a) {
        if (null == a || a.length < 2) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            // 暂存
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,100,900,121212,9};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
