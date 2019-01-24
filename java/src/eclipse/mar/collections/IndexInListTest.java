package eclipse.mar.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 12:19
 */
public class IndexInListTest {
    /**
     * 1 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
     * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100000);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(100);
        int index = countIndex(list, 100);
        System.out.println(index);
    }

    private static int countIndex(List<Integer> list, int i) {
        for (int i1 = 0; i1 < list.size(); i1++) {
            if (list.get(i1).equals(i)) {
                return i1;
            }

        }
        return -1;
    }
}
