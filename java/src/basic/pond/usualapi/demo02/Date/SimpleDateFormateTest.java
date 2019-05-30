package basic.pond.usualapi.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/19 0019 9:10
 */
public class SimpleDateFormateTest {
    public static void main(String[] args) throws ParseException {
        Date bir = new SimpleDateFormat("yyyy-MM-dd").parse("2019-5-19");
        System.out.println(bir);
    }
}
