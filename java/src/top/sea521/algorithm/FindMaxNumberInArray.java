package top.sea521.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/21 0021 10:57
 */
public class FindMaxNumberInArray {
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
