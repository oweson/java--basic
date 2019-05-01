package top.sea521.algorithm.collection;

import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/30 0030 8:33
 */
public class FindIndex {
    /**
     * 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
     * <p>
     * 定义replace方法，将某集合中的某元素，全部替换为新元素。
     */
    public static int findIndex(List<Integer> list, int i) {
        int index = -1;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == i) {
                index = j;
                break;
            }
        }
        return index;
    }

    public static void replace(List<Integer> list, Integer oldValue, Integer newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);
            }
        }
    }
}
