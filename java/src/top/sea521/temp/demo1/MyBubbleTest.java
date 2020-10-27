package top.sea521.temp.demo1;

/**
 * @author oweson
 * @date 2020/10/22 12:00
 */


public class MyBubbleTest {
    static int[] arr = {1, 2, 3, 8, 6, 100};

    /**
     * 1 冒泡排序
     *
     * @param arr
     */
    public static final void sortArrar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 1 假设第一个就是最大的
                int tmp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    // 2 小的前移一位
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
    }

    /**
     * 2 求出数组的最大值
     *
     * @param arr
     */
    public static int maxValueInArray(int[] arr) {
        int maxValue = 0;
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        sortArrar(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(maxValueInArray(arr));

    }
}
