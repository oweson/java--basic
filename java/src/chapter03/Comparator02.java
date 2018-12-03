package chapter03;

import java.util.Comparator;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/3 0003 16:54
 */
public class Comparator02 implements Comparator<Pig> {
    public static void main(String[] args) {
        Pig pig = new Pig(24);
        Pig pig1 = new Pig(25);
        Pig pig2 = new Pig(26);
        Pig pig3 = new Pig(24);
        Comparator02 ppx = new Comparator02();
        int compare = ppx.compare(pig, pig1);
        System.out.println(compare);
        System.out.println(ppx.compare(pig,pig3));
    }

    /**
     * 1 Comparator可以认为是是一个外比较器，个人认为有两种情况可以使用实现Comparator接口的方式：
     * <p>
     * 1、一个对象不支持自己和自己比较（没有实现Comparable接口），但是又想对两个对象进行比较
     * <p>
     * 2、一个对象实现了Comparable接口，但是开发者认为compareTo方法中的比较方式并不是自己想要的那种比较方式
     * <p>
     * Comparator接口里面有一个compare方法，方法有两个参数T o1和T o2，是泛型的表示方式，分别表示待比较的两个对象，方法返回值和Comparable接口一样是int，有三种情况：
     * <p>
     * 1、o1大于o2，返回正整数
     * <p>
     * 2、o1等于o2，返回0
     * <p>
     * 3、o1小于o3，返回负整数
     */
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    @Override
    public int compare(Pig o1, Pig o2) {
        if (o1.getAge().compareTo(o2.getAge()) > 0) {
            return 1;
        } else if (o1.getAge().compareTo(o2.getAge()) < 0) {
            return -1;
        }
        return 0;
    }
}
