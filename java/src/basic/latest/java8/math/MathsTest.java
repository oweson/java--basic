package basic.latest.java8.math;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/10/26 19:40
 */
public class MathsTest {
    public static double average(int[] arr) {
        return IntStream.of(arr)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }
    // 1 除数默认double
    public static double average(long[] arr){
        return  LongStream.of(arr).average().orElseThrow(()->new IllegalArgumentException("参数异常"));

    }
    public static int generateRandomInt() {
        return ThreadLocalRandom.current().nextInt();
    }
    public static String osName() {
        return System.getProperty("os.name").toLowerCase();
    }
    public static boolean isNumeric(final String input) {
        return IntStream.range(0, input.length())
                .allMatch(i -> Character.isDigit(input.charAt(i)));
    }
    public static String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }
    public static String toCamelCase(String input) {
        Matcher matcher = Pattern.compile("[A-Z]{2,}(?=[A-Z][a-z]+[0-9]*|\\b)|[A-Z]?[a-z]+[0-9]*|[A-Z]|[0-9]+").matcher(input);
        List<String> matchedParts = new ArrayList<>();
        while (matcher.find()) {
            matchedParts.add(matcher.group(0));
        }
        String s = matchedParts.stream()
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
                .collect(Collectors.joining());
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }

    public static void main(String[] args) {
        long[] arr = {1L,2L,3L,4L,5L,6L};
        double average = average(arr);
        System.out.println("平均数："+average);
        System.out.println(generateRandomInt());
        System.out.println(osName());
        System.out.println(isNumeric("1000"));
        System.out.println(isNumeric("100s"));
        String s="";
        System.out.println(toCamelCase("hello,world,isgreat!"));

    }
}
