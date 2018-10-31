package offer.list;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/4 0004 16:05
 */
public class ConcurrentHashMapDemo1 {
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


    }
}
