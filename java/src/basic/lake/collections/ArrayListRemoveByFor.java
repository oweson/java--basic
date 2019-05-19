package basic.lake.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/17 0017 7:22
 */
public class ArrayListRemoveByFor {
    public static void main(String[] args) {
        /**删除用迭代，列表的大小和小标是变化的随着删除；
         * 在这个方法中有一个严重的错误。当一个元素被删除时，
         * 列表的大小缩小并且下标变化，
         * 所以当你想要在一个循环中用下标删除多个元素的时候，它并不会正常的生效。*/
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);

    }
}
