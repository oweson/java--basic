package basic.latest.java8.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/29 0029 21:54
 */
public class SelectLambdaAndSelectAndCutTest {
    public static void main(String[] args) {
        test3();

    }

    @Test
    public void test1() {
        /* 1 lambda的切片和筛选*/
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(15, "lo")));
        Stream<Student> studentStream = students.stream().filter((s) -> s.getAge() > 21);
        studentStream.forEach(System.out::println);
        /* 2 是内部遍历的*/

    }

    @Test
    public void test2() {
        /*lambda的切片和筛选*/
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(15, "lo")));
        Stream<Student> studentStream = students.stream().filter((s) -> s.getAge() > 2).limit(2).distinct().sorted();
        /*limit就取两个*/
        studentStream.forEach(System.out::println);
        /*是内部遍历的*/

    }

    public static void test3() {
        /*lambda的切片和筛选*/
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(15, "lo")));
        Stream<Student> studentStream = students.stream().filter((s) -> {
            System.out.println("具有短路效果");
            /*通过短路提高效率*/
            return s.getAge() > 2;
        }).limit(2);
        Stream<Student> limit = students.stream().filter((s) -> {
            return s.getAge() > 0;
        }).limit(100);
        List<Student> studentList = students.stream().filter((s) -> s.getAge() > 0).limit(100).collect(Collectors.toList());
        studentStream.forEach(System.out::println);
        /*是内部遍历的*/

    }

    @Test
    public void test4() {
        /**lambda的切片和筛选*/
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(15, "lo")));
        Stream<Student> studentStream = students.stream().filter((s) -> s.getAge() > 2).skip(2);
        /**跳过前两个*/
        studentStream.forEach(System.out::println);
        /**是内部遍历的*/

    }

    @Test
    public void test5() {
        /**lambda的切片和筛选*/
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(15, "lo")));
        /**去除重复的时候student对象必须重写equal()和hashcode();*/
        Stream<Student> studentStream = students.stream().filter((s) -> s.getAge() > 2).distinct();
        studentStream.forEach(System.out::println);
        /**是内部遍历的*/

    }


}
