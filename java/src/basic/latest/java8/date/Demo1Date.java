package basic.latest.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/12/20 16:36
 */
public class Demo1Date {
    public static void main(String[] args) {
        // 1 年月日
        System.out.println(LocalDate.now());
        // 2 年月日时分秒
        System.out.println(LocalDateTime.now());
        // 3 时分秒
        System.out.println(LocalTime.now());
    }
}
