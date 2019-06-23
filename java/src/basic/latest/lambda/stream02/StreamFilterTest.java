package basic.latest.lambda.stream02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 10:38
 */
public class StreamFilterTest {
    public static void main(String[] args) {
        /** 1 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
         * 使用Stream将以郭字开头的元素存入新数组*/
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String[] strings = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string);

        }
        /** 2 取出前两个*/
        List<Integer> list = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        list.stream().limit(2).forEach(System.out::println);
        /** 3 取出后两个*/
        System.out.println("--------------------------------------------");
        list.stream().skip(list.size() - 2).forEach(System.out::println);

    }
}
