package basic.latest.lambda02;

import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:04
 */
public class FilterTest {
    public static final void demo1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Integer[] integers = stream.filter(s -> s% 2 == 1).toArray(Integer[]::new);
        for (Integer integer : integers) {
            System.out.println(integer);

        }

    }

    /**
     * 过滤：filter、结果收集(数组)
     */

    public static void main(String[] args) {
        demo1();
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String[] guos = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);
    }
}
