package basic.latest.jdk18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/10 0010 21:07
 */
public class NewDateTest {
    public static void testDate() {
        // 1. 获取当前日期(年月日) -----打印输出-----2018-01-29
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        // 2. 根据年月日构建Date ----打印输出-----2018-01-30
        LocalDate localDate1 = LocalDate.of(2018, 01, 30);
        // 3. 字符串转换日期,默认按照yyyy-MM-dd格式，也可以自定义格式 -----打印输出-----2018-01-30
        LocalDate localDate2 = LocalDate.parse("2018-01-30");
        // 4. 获取本月第一天 -----打印输出-----2018-01-01
        LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
        // 5. 获取本月第二天  -----打印输出-----2018-01-02
        LocalDate secondDayOfMonth = localDate.withDayOfMonth(2);
        // 6. 获取本月最后一天 -----打印输出-----2018-01-31
        LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        // 7. 明天 -----打印输出----- 2018-01-30
        LocalDate tomorrowDay = localDate.plusDays(1L);
        // 8. 昨天 -----打印输出----- 2018-01-28
        LocalDate yesterday = localDate.minusDays(1L);
        // 9. 获取本年第12天 -----打印输出----- 2018-04-30
        LocalDate day = localDate.withDayOfYear(120);
        // 10. 计算两个日期间的天数
        long days = localDate.until(localDate1, ChronoUnit.DAYS);
        System.out.println(days);
        // 11. 计算两个日期间的周数
        long weeks = localDate.until(localDate1, ChronoUnit.WEEKS);
        System.out.println(weeks);
    }

    public static void main(String[] args) {
        testDate();
        /** 1  1、LocalDate、LocalTime、LocalDateTime 类的实例是不可变的对象，
         * 分别表示使用ISO-8601日历系统的日期、时间、日期和时间。
         * 它们提供了简单的日期或时间，并不包含当前的时间信息。
         * 也不包含与时区相关的信息。*/
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
