package eclipse.mar.array;

public class ArrayReverse {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 78, 90, 990};
        reverseArr(arr);
        // 数组的反转。
        // 数组的遍历；

        print(arr);
        // TODO Auto-generated method stub

    }

    private static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tem;
        }
        // TODO Auto-generated method stub

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        // TODO Auto-generated method stub

    }

}
