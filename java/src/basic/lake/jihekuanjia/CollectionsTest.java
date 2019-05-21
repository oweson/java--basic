package basic.lake.jihekuanjia;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/3 0003 22:36
 */
public class CollectionsTest {
    public static void main(String[] args) {
        Collection c= new ArrayList(100);
        demo1OfTestCollections();
    }
    private static void demo1OfTestCollections() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        // 把顺序给打乱；
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // 交换进行排序；
        Collections.swap(list, 0, 8);
        System.out.println(list);
        // 交换制定数据的下标
        Collections.rotate(list, 2);
        System.out.println(list);
        // 把集合数据网右边进行滚动
        Collections.synchronizedList(list);
        // 把集合安全化；
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                set.add(i * 2);
            } else {

                set.add(i * 10);
            }
        }
        Collections.synchronizedSet(set);
        System.out.println(set);
        System.out.println(set);
    }
}