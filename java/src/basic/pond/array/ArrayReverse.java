package basic.pond.array;

public class ArrayReverse {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 78, 90, 990};
        reverseArr(arr);
        // 1 数组的反转。
        // 2 数组的遍历；
        demo1(arr);
       // print(arr);


    }

    public static final void demo1(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=arr[i];

            }

        }
        for (int i : arr) {
            System.out.println(i);

        }
    }

    private static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tem;
        }


    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }

}
