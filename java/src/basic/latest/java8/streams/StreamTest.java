package basic.latest.java8.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/27 0027 19:47
 */
public class StreamTest {
    @Test
    public void testDemo1() {
        /* 1 通过collection集合创建stream*/
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        /* 2 通过Arrays中的静态方法*/
        Integer[] integers = new Integer[10];
        Student student = new Student();
        Stream<Integer> stream1 = Arrays.stream(integers);
        /* 3 通过stream的静态方法of*/
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        /* 4 创建无限流*/
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(10).forEach(System.out::println);
        System.out.println("=========================================");
        /* 5 生成*/
        Stream.generate(() -> Math.random() * 100).limit(10).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        List<Double> collect = Stream.generate(() -> Math.random() * 100).limit(21).collect(Collectors.toList());
        for (Double aDouble : collect) {
            System.out.println(aDouble);

        }
    }
}
