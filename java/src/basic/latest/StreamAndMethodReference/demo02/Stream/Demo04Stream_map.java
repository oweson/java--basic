package basic.latest.StreamAndMethodReference.demo02.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * todo Stream流中的常用方法_map:用于类型转换
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法.
 * <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 * 该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
 * Function中的抽象方法:
 * R apply(T t);
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        // 1 获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<String> streamLatest = Stream.of("1", "2", "3", "4");

        // 2 使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
        Stream<Integer> stream2 = stream.map(Integer::parseInt);
        // 3 遍历Stream2流
        stream2.forEach(System.out::println);
        // map是转换
        List<Double> doubleList = streamLatest.map(Double::new).limit(100).collect(Collectors.toList());
        doubleList.forEach(System.out::println);
    }
}
