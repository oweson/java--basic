package cattle.pig.code;

import static sun.misc.Version.print;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:42
 */
public class BasicTest {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        double x=2.0; int y=4;
        x/=++y;
        System.out.println(x);
        /** 0.4
         *
         * 解析：++y，则y=5
         * int的5转成double的5
         * x=2.0/5=0.4（这里是double的5 ）*/
    }
}
