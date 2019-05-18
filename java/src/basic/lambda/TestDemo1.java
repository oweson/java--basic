package basic.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月16日 上午10:17:31 类说明：侵权必究。。。。。。。
 */
/*
 * Java 8 新特性 Java 8 (又称为 jdk 1.8) 是 Java 语言开发的一个主要版本。 Oracle 公司于 2014 年 3 月 18
 * 日发布 Java 8 ，它支持函数式编程，新的 JavaScript 引擎，新的日期 API，新的Stream API 等。
 */
/*
 * Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。 Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * 使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 */
public class TestDemo1 {
    public void sortJdk17(List<String> list) {
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

    public void sortJdk18(List<String> list) {
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");
        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.sortJdk17(names1);
        System.out.println(names1);
        // 打印集合的名字就是打印value
        testDemo1.sortJdk18(names2);
        System.out.println(names2);

    }

}
