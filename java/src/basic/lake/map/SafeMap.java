package basic.lake.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 17:13
 */
public class SafeMap {
    public static void main(String[] args) {
        /** 1 #### 1.1.1 实现和继承关系
         -  **实现**  Map接口,Map是"key-value键值对"接口;
         -  **实现**  java.io.Serializable 接口,支持序列化,能通过序列化去传输;
         #### 1.1.2 底层实现
         ```
         Collections.synchronizedMap和HashTable一样,实现了在调用Map所有方法时,对整个map进行同步;*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i);

        }
        Map<Integer, Integer> synchronizedMap = Collections.synchronizedMap(map);
        Iterator<Map.Entry<Integer, Integer>> entryIterator = synchronizedMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, Integer> integerEntry = entryIterator.next();
            System.out.println(integerEntry.getKey() + " :" + integerEntry.getValue());
        }
        // 2 并发集合
        /**ConcurrentSkipListMap的底层是通过跳表来实现的。跳表是一个链表，
         * 但是通过使用“跳跃式”查找的方式使得插入、读取数据时复杂度变成了O（logn）。
         * ConcurrentSkipListMap是线程安全的有序的哈希表，适用于高并发的场景。
         * ConcurrentSkipListMap和TreeMap，它们虽然都是有序的哈希表。但是，第一，它们的线程安全机制不同，
         * TreeMap是非线程安全的，
         * 而ConcurrentSkipListMap是线程安全的。第二，ConcurrentSkipListMap是通过跳表实现的
         * 而TreeMap是通过红黑树实现的。
         * 关于跳表(Skip List)，它是平衡树的一种替代的数据结构，但是和红黑树不相同的是，
         * 跳表对于树的平衡的实现是基于一种随机化的算法的，这样也就是说跳表的插入和删除的工作是比较简单的。*/
        Map map1 = new ConcurrentHashMap();
        map1 = new ConcurrentSkipListMap();
    }
}
