package basic.lake.collection.demo01.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月10日 下午7:02:47 类说明：侵权必究。。。。。。。
 */

public class Student {
    String number;
    int age;
    String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [number=" + number + ", age=" + age + ", name=" + name + "]";
    }

    public Student(String number, int age, String name) {
        super();
        this.number = number;
        this.age = age;
        this.name = name;
    }

    public Student() {
    }
}
