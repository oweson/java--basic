package pig.zhongwang;

/**
 * @author chengwanli
 * @date 2020/10/20 7:59
 */


public class StringBufferTest {

    public static void buffer(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;

    }

    public static void main(String[] args) {
        StringBuffer a = null;
        StringBuffer b = null;
        buffer(new StringBuffer("a"), new StringBuffer("b"));
        System.out.println(a + ":  " + b);
        // null,null

    }
}
