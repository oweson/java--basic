package pig.unknow;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/6 0006 23:20
 */
public class BubbleSort {
    public static void main(String[] args) {
        demo1();
    }
    public static final void demo1(){

        int[] arr = {1,2,8,9,3,100};
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
