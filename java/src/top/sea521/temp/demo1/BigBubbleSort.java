package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/17 0017 19:54
 */
public class BigBubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,1,100};
        demo1(arr);
        for (int i : arr) {
            System.out.println(i);

        }
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
    }
}
