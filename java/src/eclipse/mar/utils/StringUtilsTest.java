package eclipse.mar.utils;

import com.sun.deploy.util.StringUtils;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 16:55
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        String trimWhitespace = StringUtils.trimWhitespace("  hello  l ");
        System.out.println(trimWhitespace.length());
    }
}
