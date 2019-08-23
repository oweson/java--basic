package basic.pond.basic.other;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/14 0014 12:07
 */
public class TestBytes {
    public static void testByte() {
        byte a = 1, b = 2, c;
        /**声明三个byte类型的数据，c=a+b进行运算
         * ，换转化为int类型，会变异失败*/
        // c=a+b;
    }

    public static void main(String[] args) {
        int x = 100;
        byte b = (byte) x;

        System.out.println(b);
        // byte b1=3,b2=4,b;
        //b=byte(b1+b2);
        b = 3 + 4;
        //哪句是编译失败的呢？为什么呢？
        //  b=b1+
        //b2会编译失败，因为定义的b1、b2、b的数据类型都是byte,b1+b2运算时会隐式转换为int数据类型运算，在赋值给byte数据类型会损失精度
        byte n = (byte) (10 + 127);
        System.out.println(n);

        int a = 10;
        // byte b= (byte) a;
        System.out.println(b);

    }
}
