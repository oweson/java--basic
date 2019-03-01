package pig.suzhouyinneng;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 17:38
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,2};
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
