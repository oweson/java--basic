package basic.lake.map.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 11:46
 */
public class Demo04ForeachMap {
    public static void main(String[] args) {
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        // 2.定义第二个数组arr2
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            String key = arr1[i];
            String value = arr2[i];
            map.put(key, value);

        }
        /** 1 遍历entryset*/
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> next = entryIterator.next();
            System.out.println("key is :" + next.getKey() + "value is :" + next.getValue());
        }
        System.out.println("==============================================");
        /** 2 遍历*/
        Iterator<String> stringIterator = map.keySet().iterator();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            System.out.println("key is :" + next + "value is :" + map.get(next));
        }
        /** 3 遍历*/
        System.out.println("--------------------------------");
        map.forEach((k, v) -> {
            System.out.print(k + ":" + v);
        });
        System.out.println(Math.sin(Math.PI / 6));
        //30接近二分之一
        System.out.println("-------------------------------------------------");
        map.forEach((k, v) -> {
            System.out.println("key is :" + k + " " + "value is :" + v);
        });

    }
}
