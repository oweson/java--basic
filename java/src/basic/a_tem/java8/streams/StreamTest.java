package basic.a_tem.java8.streams;

import basic.a_tem.java8.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/27 0027 19:47
 */
public class StreamTest {
    @Test
    public void testDemo1() {
        /**通过collection集合创建stream*/
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        /**通过Arrays中的静态方法*/
        Integer[] integers = new Integer[10];
        Student student = new Student();
        Stream<Integer> stream1 = Arrays.stream(integers);
        /**t通过stream的静态方法of*/
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        /**创建无限流*/
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(10).forEach(System.out::println);
        /**生成*/
        Stream.generate(() -> Math.random() * 100).limit(10).forEach(System.out::println);
    }
}
