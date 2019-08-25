package basic.lake.map.demo03.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/4 0004 16:05
 */
public class Demo04ConcurrentHashMapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("21", "hello");
        map.put("211", "hello");
        map.put("121", "hello");
        map.put("2211", "hello");
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            /**得到key*/
            String next = iterator.next();
            System.out.println("key is" + next + "value is" + map.get(next));
        }
        // 遍历2
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println("key is :" + stringStringEntry.getKey() + "value is :" + stringStringEntry.getValue());

        }
        // 遍历 3
        System.out.println("lambda遍历---------------------------------------------");
        map.forEach((k, v) -> {
            System.out.println(k + "   :" + v);
        });


    }
}
