package basic.latest.lambda02;

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
        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        List<String> strList = Stream.concat(streamA, streamB).collect(Collectors.toList());
    }
}
