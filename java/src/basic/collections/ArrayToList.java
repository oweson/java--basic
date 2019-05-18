package basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 12:13
 */
public class ArrayToList {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        arrayToList(arr);
    }

    private static void arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        System.out.println(list);
    }
}
