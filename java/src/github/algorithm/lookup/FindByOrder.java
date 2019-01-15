package github.algorithm.lookup;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 14:32
 */
public class FindByOrder {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 9, 0, 12, 1000};
        int[] arr=new int[10000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i]=i;

        }
        int i = find(arr, 8089899);
        System.out.println(i);
    }

    private static int find(int[] arr, int key) {
        /**顺序查找，效率很低！*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }


        }
        return -1;
    }
}
