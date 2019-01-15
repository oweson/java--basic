package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:26
 */

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);//ab
        y = x;//ab
        /**解析：a,b是对象的引用，指向堆内存，将a，b两个引用传给x，y，
         * 执行x.append(y)，改变了x引用指向的堆内存的存储内容，变为AB，
         *  y = x，表示引用y,指向引用x指向的存储区域，没有改变引用b，指向的存储空间的内容*/
    }
}
