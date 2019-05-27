package basic.river.interfaces;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/10 0010 21:15
 */
public class Pig implements NewInterfaceTest {
    public static void main(String[] args) {
        /** 1 dedault方法不一定要重写，当然根据需要也可以重写*/
        Pig ppx = new Pig();
        ppx.demo2();
        /** 2 接口的静态方法必须通过接口名.方法名调用*/
        NewInterfaceTest.demo1();
    }
}
