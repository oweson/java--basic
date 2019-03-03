package top.sea521.temp;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/2 0002 9:12
 */
public class BubbleSort {
    public static final void demo1(){
        int [] arr={1,2,9,0,100};
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

    public static void main(String[] args) {
        demo1();
    }
}
