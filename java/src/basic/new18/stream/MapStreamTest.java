package basic.new18.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 11:06
 */
public class MapStreamTest {
    public static void main(String[] args) {
        // 1 绝对值
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, -2, -100);
        stream.map(Math::abs).forEach(System.out::println);
        // 2 已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，
        // 使用Stream将二者合并到List集合
        System.out.println("======================================================");
        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        List<String> stringList = Stream.concat(streamA, streamB).collect(Collectors.toList());
        System.out.println(stringList);

    }
}
