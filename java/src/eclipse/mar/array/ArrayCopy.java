package eclipse.mar.array;

import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/4 0004 8:44
 */
public class ArrayCopy {
    public static void main(String[] args) {
        /**数组的拷贝*/
        int[] a = {1, 2, 3, 4, 5};
        int[] ints = Arrays.copyOf(a, a.length);
        System.out.println(new String(ints.toString()));
        for (int anInt : ints) {
            System.out.println(anInt);

        }
    }
}
