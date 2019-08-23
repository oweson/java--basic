package basic.pond.array.demo03;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/1 0001 15:51
 */
public class Demo5FindMax {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
