package office.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 12:19
 */
public class BubbleSort02 {
    public static void main(String[] args) {
        int[] arr={1,2,12,100,21};
        demo1(arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }

    private static void demo1(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < arr.length-i-1; i1++) {
                if(arr[i1]>arr[i1+1]){
                    int tem=arr[i1];
                   arr[i1]=arr[i1+1];
                   arr[i1+1]=tem;
                   // 核心的思想大的往后放


                }

            }

        }
    }
}
