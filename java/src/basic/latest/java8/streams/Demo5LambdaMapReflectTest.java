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
 * @Date：2018/7/29 0029 22:16
 */
public class Demo5LambdaMapReflectTest {
    @Test
    public void test1() {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(15, "lo")));
        /* 1 通过map函数把集合中的每一个value都映射出来；*/
        students.stream().map((s) -> s.getName()).forEach(System.out::println);
        List<Student> studentList = students.stream().filter(x -> x.getAge() > 12).collect(Collectors.toList());
        /* 2 去除重复的时候student对象必须重写equal()和hashcode();*/
        List<Integer> integerList = students.stream().map(Student::getAge).limit(100).collect(Collectors.toList());
        for (Integer integer : integerList) {
            System.out.println("oweson:" + integer);

        }

    }

    public static Stream<Character> changeStrToCharcter(String str) {
        List<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void test2() {
        /** 1 集合中的str转换成character*/
        List<String> list = Arrays.asList("aaa", "bbb");
        Stream<Character> characterStream = list.stream().flatMap(Demo5LambdaMapReflectTest::changeStrToCharcter);
        characterStream.forEach(System.out::println);
    }

    @Test
    public void testSort() {

        List<Student> students = Arrays.asList(new Student(21, "aaa"), new Student(22, "bbb"));
        students.stream().sorted((s1, s2) -> {
            if (s1.getAge().equals(s2.getAge())) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return s1.getName().compareTo(s2.getName());
            }
        }).forEach(System.out::println);

    }

}
