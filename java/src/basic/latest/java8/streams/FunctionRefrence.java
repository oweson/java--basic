package basic.latest.java8.streams;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/26 0026 20:15
 */
public class FunctionRefrence {
    @Test
    public void testDemo1() {
        Student student = new Student();
        /* 1 对象方法引用*/
        Supplier<Integer> supplier = student::getAge;
        Integer integer = supplier.get();
        System.out.println(integer);
    }

    @Test
    public void testDemo2() {
        /* 2 静态方法引用*/
        Comparator<Integer> con = Integer::compareTo;
        int compare = con.compare(100, 210);
        System.out.println(compare);
    }

    @Test
    public void testDemo3() {
        /* 3 类名实例方法名*/
        BiPredicate<String, String> bi = String::equalsIgnoreCase;
        boolean test = bi.test("a", "b");
        System.out.println(test);
    }

    @Test
    /* 4 构造器引用，得到对象*/
    public void testDemo4() {
        Supplier<Student> sup = Student::new;
        Student student = sup.get();
        System.out.println(student.getAge());
    }


    /**
     * 5 数组的引用
     */
    @Test
    public void testDemo6() {
        Function<Integer, String[]> fun = String[]::new;
        String[] apply = fun.apply(100);
        System.out.println(apply.length);
    }

    /**
     * 6 实例引用
     */
    @Test
    public void testDemo7() {
        Consumer<Integer> con = System.out::println;
        con.accept(101);
    }
}
