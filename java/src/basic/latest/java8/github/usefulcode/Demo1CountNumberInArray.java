package basic.latest.java8.github.usefulcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo1CountNumberInArray {
    // 是不是偶数
    public static boolean isEven(final int value) {
        return (value & 0b1) == 0;
    }
    public static long countOccurrences(int[] numbers, int value) {
        return Arrays.stream(numbers)
                .filter(number -> number == value)
                .count();
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        System.out.println(countOccurrences(arr, 1));

    }
}
