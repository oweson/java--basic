package top.sea521.algorithm.sorts;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/17 0017 11:31
 */
public class ChooseSort {
    public static void ChooseSorts(int[] arr) {
        /**得到数组的长度*/
        int length = arr.length;
        /**临时变量*/
        int tem = 0;
        for (int i = 0; i < length; i++) {
            /**待确定的位置*/
            int k = i;
            for (int j = length - 1; j > i; j--) {
                if (arr[j] < arr[k]) {
                    /**这里是位置，就是下标*/
                    k = j;
                }


            }
            tem = arr[i];
            arr[i] = arr[k];
            arr[k] = tem;


        }
        for (int i : arr) {
            System.out.println(i);
            
        }
        System.out.println(arr.toString());


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8, 9, 100, 89, 81};
        ChooseSort.ChooseSorts(arr);
    }
}
