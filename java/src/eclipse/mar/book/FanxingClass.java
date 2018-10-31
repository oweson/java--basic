package eclipse.mar.book;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午7:40:23 类说明：侵权必究。。。。。。。
 */

public class FanxingClass<T> {
    public static <T> T testSth(T... a) {
        //System.out.println(T);

        return null;

    }

    public static void main(String[] args) {
        Integer testSth = testSth(1, 2, 3);
        String testSth2 = testSth("21,", "22");
        System.out.println(testSth2);
        System.out.println(testSth2);

    }

}
