package basic.pond.array;

public class ArrayMax {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 89, 100};
        int max = getMax(arr);
        System.out.println("最大的是:   " + max);

    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

}
