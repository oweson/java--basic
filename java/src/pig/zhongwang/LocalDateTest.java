package pig.zhongwang;

import java.time.LocalDate;

/**
 * @author oweson
 * @date 2020/10/20 17:58
 */


public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.plusMonths(1L));
    }
}
