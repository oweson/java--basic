package top.sea521.temp;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/7 0007 20:06
 */
public class BubbleSortNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,2,1,1,9,100};
        demo1(arr);
    }

    private static void demo1(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
