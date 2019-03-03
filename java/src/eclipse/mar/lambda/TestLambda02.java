package eclipse.mar.lambda;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月16日 下午12:20:44 类说明：侵权必究。。。。。。。
 */
interface convrt<t1, t2> {
    void convert(int i);
}

public class TestLambda02 {

    public static void main(String[] args) {
        final int i = 100;
        TestLambda02 testLambda02 = new TestLambda02();
        convrt<Integer, String> convrt = (param) -> System.out.println(String.valueOf(param + i));
        convrt.convert(100);
        int a = 1 - 1 - 1;

    }

}
