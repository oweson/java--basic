package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:41
 */
public class LoonMaxNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,9,1010210201,210210000};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }


        }
        System.out.println(max);
    }
}
