package cattle.pig.code;


import java.io.UnsupportedEncodingException;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 10:55
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="asjaksj";
        String gbk = new String(s.getBytes(), "GBK");
        System.out.println(gbk);
    }
}
