package basic.lake.map.demo01.Map;

import java.util.Properties;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/30 0030 14:25
 */
public class Demo05PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("a", "hello,wordl");
        String a = properties.getProperty("a");
        System.out.println(a);
    }
}
