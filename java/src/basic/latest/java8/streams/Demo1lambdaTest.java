package basic.latest.java8.streams;

import java.util.HashMap;
import java.util.Map;

public class Demo1lambdaTest {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("公众号", "Java3y");
        hashMap.put("交流群", "回复1");

        // 1 使用增强for的方式来遍历hashMap
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        // 2 使用Lambda表达式的方式来遍历hashMap,k,v
        hashMap.forEach((k,v)->{
            System.out.println(k+" :"+v);
        });
    }
}
