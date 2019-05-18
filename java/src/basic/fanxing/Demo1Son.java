package basic.fanxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午4:05:07 类说明：侵权必究。。。。。。。
 */

public class Demo1Son {

    public static void main(String[] args) {
        /*
         * 示例 1 : ? extends  ArrayList heroList<? extends Hero>
         * 表示这是一个Hero泛型或者其子类泛型 heroList 的泛型可能是Hero heroList 的泛型可能是APHero
         * heroList 的泛型可能是ADHero 所以 可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的
         * 但是，不能往里面放其他的东西，因为 放APHero就不满足<ADHero> 放ADHero又不满足<APHero>
         */
        ArrayList<? extends Demo1> demo1s = new ArrayList<>();
        /*
         * 但是，不能往里面放东西
         */
        ArrayList<Demo1Son2> aaa = new ArrayList<>();
        aaa.add(new Demo1Son2());
        aaa.add(new Demo1Son2());
        aaa.add(new Demo1Son2());
        demo1s = aaa;
        Demo1 demo1 = demo1s.get(0);
        System.out.println(demo1);


    }

}
