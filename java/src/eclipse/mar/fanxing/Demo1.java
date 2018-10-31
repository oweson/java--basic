package eclipse.mar.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午3:55:46 类说明：侵权必究。。。。。。。
 */

public class Demo1 {
    public void demoPutOnlyNumber() {
        /*
         * 根据数字类的知识，设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串
         */
        List<Number> list = new ArrayList<Number>();
        list.add(1);
        // answer;
        /*
         * 泛型使用Number, 就可以放所有Number的子类，比如Integer,Float,Double
         *
         * 但是不能放String
         */
        list.add(2.00);
        list.add(12l);
        // list.add("dsds");
        for (Number number : list) {
            System.out.println(number);

        }

    }
    /*
     * 示例 2 : 使用泛型 顶 折 纠 问 使用泛型的好处： 泛型的用法是在容器后面添加<Type> Type可以是类，抽象类，接口
     * 泛型表示这种容器，只能存放APHero，ADHero就放不进去了。
     */

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        new Demo1().demoPutOnlyNumber();
        /*
         * 示例 4 : 泛型的简写 顶 折 纠 问 为了不使编译器出现警告，需要前后都使用泛型，像这样：
         *
         * ArrayList<Hero> heros = new ArrayList<Hero>();
         *
         *
         * 不过JDK7提供了一个可以略微减少代码量的泛型简写方式
         *
         * ArrayList<Hero> heros2 = new ArrayList<>();
         *
         *
         * 后面的泛型可以用<>来代替，聊胜于无吧
         */
        List list = new ArrayList<Student>();
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // TODO Auto-generated method stub

    }

}
