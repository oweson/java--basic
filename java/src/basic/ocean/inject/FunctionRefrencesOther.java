package basic.ocean.inject;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月17日 上午8:37:21 类说明：侵权必究。。。。。。。
 */

public class FunctionRefrencesOther {
    public void test() {
        System.out.print("hello");
    }

    public void testWorld() {
        this.test();
        /*
         * 这个时候this可有可无,跨方法调用直接在方法内部调用就可以了*/
        System.out.println("  " + "world");
    }

    public static void main(String[] args) {
        new FunctionRefrencesOther().testWorld();

    }

}
