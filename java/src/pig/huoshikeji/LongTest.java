package pig.huoshikeji;

import sun.security.provider.PolicySpiFile;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 18:42
 */
public class LongTest {
    public static final Long demo1(double a,double b){
        return (long)(a+b);
    }
    public static void main(String[] args) {
        long demo1 = demo1(12.3, 4.6);
        System.out.println(demo1);
        // 16

    }
}
