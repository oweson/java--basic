package top.sea521.algorithm.collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/30 0030 8:31
 */
public class InputStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("1.录入信息 0.退出");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    inputStu(list , scanner);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
            if (i == 0){
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.show();
        }
    }

    private static void inputStu(ArrayList<Student> list , Scanner sc) {
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        Student student = new Student(name, age);
        list.add(student);
    }
}
