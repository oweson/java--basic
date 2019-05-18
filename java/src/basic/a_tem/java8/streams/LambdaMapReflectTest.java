package basic.a_tem.java8.streams;

import basic.a_tem.java8.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/29 0029 22:16
 */
public class LambdaMapReflectTest {
    @Test
    public void test1() {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(21, "ppx"), new Student(31, "op"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"), new Student(12, "oweson"),
                new Student(15, "lo")));
        /**通过map函数把集合中的每一个value都映射出来；l*/
        students.stream().map((s) -> s.getName()).forEach(System.out::println);
        /**去除重复的时候student对象必须重写equal()和hashcode();*/

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
        /**把集合中的str转换成charracter*/
        List<String> list = Arrays.asList("aaa", "bbb");
        Stream<Character> characterStream = list.stream().flatMap(LambdaMapReflectTest::changeStrToCharcter);
        characterStream.forEach(System.out::println);
    }

    @Test
    public void testSort() {

        List<Student> students = Arrays.asList(new Student(21, "aaa"), new Student(22, "bbb"));
        students.stream().sorted((s1, s2) -> {
            if (s1.getAge() == s2.getAge()) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return s1.getName().compareTo(s2.getName());
            }
        }).forEach(System.out::println);

    }

}
