package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:27
 */
public class BubboleSort {
    public static void main(String[] args) {
        int[] arr={9,0,101,321};
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
