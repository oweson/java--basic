package eclipse.mar.lambda;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:32:11 类说明：侵权必究。。。。。。。
 */

public class MyLambda {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        System.out.println(a);
        Set set = new HashSet<>();
        set.add(10);
        set.add(21);
        /**这两种方法都是一样的！！！*/
        set.forEach(pp -> System.out.println(pp));
        set.forEach(System.out::println);


    }

}
