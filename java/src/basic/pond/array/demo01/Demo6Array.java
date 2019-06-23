package basic.pond.array.demo01;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/31 0031 11:32
 */
public class Demo6Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printNumber(arr);
    }

    private static void printNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+",");

        }
    }
}
