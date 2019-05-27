package top.sea521.temp.demo1;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 10:52
 */
public class SortFish {
    public static final void demo1(){
        int[] arr={1,2,3,0,100,21,5,9};
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
