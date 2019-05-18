package basic.usualapi.demo08StringBuffer;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/1 0001 20:12
 */
public class Demo1StringBuffer {
    /**
     * StringBuffer中的方法都加了synchronized关键字）。
     * 所以网上很多资料都说，多线程不要用StringBuilder，否则会出现问题。
     * 但是效率比较低，适合多线程下，追求安全的场景；
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuffer a = stringBuffer.append('a').append(1).append(1.1);
        System.out.println(a.toString());
    }
}
