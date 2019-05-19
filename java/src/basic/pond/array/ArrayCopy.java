package basic.pond.array;

import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/4 0004 8:44
 */
public class ArrayCopy {
    public static void main(String[] args) {
        /** 1 数组的拷贝*/
        int[] a = {1, 2, 3, 4, 5};
        int[] ints = Arrays.copyOf(a, a.length);
        System.out.println(new String(ints.toString()));
        for (int anInt : ints) {
            System.out.println(anInt);

        }
        System.out.println("========================================");
        /** 2 高级的复制*/
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 1, copyTo, 0, 5);
        System.out.println(new String(copyTo));

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        System.out.println("===========================");
        /** 3 复制工具类*/
        char[] copyFrom02 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo02 = java.util.Arrays.copyOfRange(copyFrom02, 2, 9);

        System.out.println(new String(copyTo02));
    }
}
