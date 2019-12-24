package basic.lake.map.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/12/24 21:33
 */
public class PigTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "hello" + i);

        }
        System.out.println("第一种遍历-----------------------------------------");
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println("key is : " + integer + "    vaiue is :  " + map.get(integer));

        }
        System.out.println("第二种遍历方式：--------------------------------------------");
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("key is :  " + next + "  valus is : " + map.get(next));
        }
        System.out.println("第三种遍历数据---------------------------------------------------");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "   :  " + integerStringEntry.getValue());
        }
        System.out.println("第四种：lambda遍历数据");
        map.forEach((k, v) -> {
            System.out.println("key is :" + k + "  valus is : " + v);
        });
    }
}
