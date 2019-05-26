package basic.lake.collection.demo01.List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 14:19
 */
public class Demo04ArrayToList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Collection collection = new ArrayList();
        arrToList(arr, collection);
        System.out.println(collection.size()+"=================");
    }

    private static void arrToList(int[] arr, Collection collection) {
        for (int i = 0; i < arr.length; i++) {
            collection.add(arr[i]);

        }
        // 遍历集合
        for (Object o : collection) {
            System.out.println(o);

        }
    }
}
