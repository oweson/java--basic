package basic.lake.collection.demo01.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/25 0025 10:07
 */
public class Demo11SaveStudentByList {
    /**
     * 1 键盘录入学生信息，保存到集合中。
     * <p>
     * - 循环录入的方式，1：表示继续录入，0：表示结束录入。
     * - 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
     * - 使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("1表示录入，0表示退出；");
            int nextInt = sc.nextInt();
            if (nextInt == 1) {
                Student s = new Student();
                System.out.println("请录入姓名");
                String name = sc.nextLine();
                s.setName(name);

                System.out.println("请录入年龄");
                int age = sc.nextInt();
                s.setAge(age);
                list.add(s);
            }
            break;


        }
        System.out.println(list);

    }
}
