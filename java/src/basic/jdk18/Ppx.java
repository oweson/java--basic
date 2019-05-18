package basic.jdk18;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/10 0010 21:15
 */
public class Ppx implements NewInterfaceTest {
    public static void main(String[] args) {
        //dedault方法不一定要重写，当然根据需要也可以重写
        Ppx ppx = new Ppx();
        ppx.demo2();
        //接口的静态方法必须通过接口名.方法名调用
        NewInterfaceTest.demo1();
    }
}
