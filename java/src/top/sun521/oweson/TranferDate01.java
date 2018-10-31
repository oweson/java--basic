package top.sun521.oweson;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:oweson
 * @Date :2018/5/22 0022 7:16
 * @色厉而胆薄，好谋而寡断
 */
public class TranferDate01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat  =new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        int i = Integer.parseInt("210", 10);
        System.out.println(i);
    }
}
