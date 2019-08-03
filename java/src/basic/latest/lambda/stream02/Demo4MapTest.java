package basic.latest.lambda.stream02;

import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:33
 */
public class Demo4MapTest {
    /**
     * 映射：map、逐一消费：forEach
     */
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(Math::abs).forEach(System.out::println);
    }
}
