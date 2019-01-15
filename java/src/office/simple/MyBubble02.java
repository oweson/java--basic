package office.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 14:19
 */
public class MyBubble02 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println("排序前：");
        for (int i : arr) {
            System.out.println(i + ",");

        }
        bubble(arr);
        System.out.println("排序后：");
        for (int i : arr) {
            System.out.println(i + ",");

        }
    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }


            }

        }
    }
}
