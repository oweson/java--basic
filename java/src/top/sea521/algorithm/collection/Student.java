package top.sea521.algorithm.collection;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/30 0030 8:32
 */
public class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println( "学生姓名=" + name + ", 年龄=" + age);
    }
}
