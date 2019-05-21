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
        Map map1 = new ConcurrentHashMap();
        map1 = new ConcurrentSkipListMap();
    }
}