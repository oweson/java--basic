package basic.swimmingpool.generics;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午3:56:28
 * 类说明：侵权必究。。。。。。。
 */

public class Student {
    private int age;
    private String name;

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

    public Student(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


}
