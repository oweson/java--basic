package basic.pond.array.array02;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/31 0031 11:49
 */
public class Demo7 {
    public static void main(String[] args) {
        /**比较两个素组是否相同，长度和内容一样！！！*/
        int[] arr = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1,2};
        boolean equals = isEquals(arr, arr2);
        System.out.println("两个 素组是："+equals);
    }

    private static boolean isEquals(int[] arr, int[] arr2) {
        if(arr.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr2[i]){
                return false;
            }

        }
        return true;
    }
}
