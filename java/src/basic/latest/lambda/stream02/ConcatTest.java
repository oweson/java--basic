package basic.latest.lambda.stream02;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:36
 */
public class ConcatTest {

    /**
     * 组合：concat、结果收集(list)
     */
    public static void main(String[] args) {
        // 1 绝对值
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, -2, -100);
        stream.map(Math::abs).forEach(System.out::println);
        // 2 已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，
        // 使用Stream将二者合并到List集合
        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        List<String> strList = Stream.concat(streamA, streamB).collect(Collectors.toList());
    }
}
