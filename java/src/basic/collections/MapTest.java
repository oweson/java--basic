package basic.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 11:46
 */
public class MapTest {
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
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> next = entryIterator.next();
            System.out.println("key is :" + next.getKey() + "value is :" + next.getValue());
        }
    }
}
