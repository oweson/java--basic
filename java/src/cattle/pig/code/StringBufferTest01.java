package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 15:08
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        //a=ab
        //System.out.println(x);
        y = x;
        //a
        //System.out.println(y);

    }
}
