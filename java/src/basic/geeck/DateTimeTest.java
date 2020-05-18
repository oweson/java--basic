package basic.geeck;

import java.util.Date;
import java.util.TimeZone;

public class DateTimeTest {
    public static void main(String[] args) {
        System.out.println(TimeZone.getDefault().getID());
        // Asia/Shanghai
        System.out.println(TimeZone.getDefault());
        System.out.println(new Date(0));
    }
}
