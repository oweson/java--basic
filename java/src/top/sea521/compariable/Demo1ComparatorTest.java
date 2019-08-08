package top.sea521.compariable;

import java.util.Comparator;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/25 0025 18:43
 */
public class Demo1ComparatorTest implements Comparator<Bird> {

    /**
     * 先按年龄排，次要按名字排
     * 根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数
     */
    @Override
    public int compare(Bird o1, Bird o2) {
        // 1 按照年龄
        int age = o1.getAge() - o2.getAge();
        // 2 年年龄相等，按照姓名排序

        if (age == 0) {
            //使用String的comareTo方法
            return o1.getName().compareTo(o2.getName());

        }
        return age;
    }
}
