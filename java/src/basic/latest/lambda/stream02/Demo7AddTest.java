package basic.latest.lambda.stream02;

import java.util.stream.Stream;

/**
 * @author chengwanli
 * @date 2020/10/4 8:59
 */


public class Demo7AddTest {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3).parallel().reduce((a, b) -> {
            return a + b;
        }).get());
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .parallel()
                .reduce((a, b) -> {
                    System.out.println(String.format("%s: %d + %d = %d",
                            Thread.currentThread().getName(), a, b, a + b));
                    return a + b;
                })
                .ifPresent(System.out::println);
    }


}
