package basic.lake.map.demo01.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/20 0020 22:18
 */
public class MapTest {
    /**
     * 1 遍历key和value
     */
    public static void ForeachMap(Map<Integer, String> map) {
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println("key 是" + integer + "values 是" + map.get(integer));

        }

    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");
        MapTest.ForeachMap(map);

    }
}
