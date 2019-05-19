package basic.latest.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/19 0019 8:52
 */
public class LambdaCollectionTest {
    public static void main(String[] args) {
        // 1 正常遍历map
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        for (Map.Entry<String, Integer> integerEntry : items.entrySet()) {
            System.out.println(integerEntry.getKey() + integerEntry.getValue());
        }
        // foreach遍历
        items.forEach((k, v) -> System.out.println("key is :" + k + "value is :" + v));
        System.out.println("===================================================");
        items.forEach((k, v) -> {
            System.out.println("key is ：" + k + " " + "value is :" + v);
            if ("E".equals(k)) {
                System.out.println("E is exists!");
            }
        });
        // 2 普通方式遍历list
        List<String> itemsList = new ArrayList<>();
        itemsList.add("A");
        itemsList.add("B");
        itemsList.add("C");
        itemsList.add("D");
        itemsList.add("E");

        for (String item : itemsList) {
            System.out.println(item);
        }
        // lambda 方式一：遍历
        itemsList.forEach((item) -> System.out.println(item));
        // 方式二
        itemsList.forEach(item -> {
            if (item.equals("D")) {
                System.out.println("print one char is ：" + item);
            }
        });
        // 方式三：
        //method reference
        //Output : A,B,C,D,E
        itemsList.forEach(System.out::println);
        // 方式四：stream,filter
        // Output : B
        itemsList.stream().filter(k -> k.contains("B")).forEach(System.out::println);

    }
}
