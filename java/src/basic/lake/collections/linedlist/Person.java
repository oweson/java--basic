package basic.lake.collections.linedlist;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/22 0022 10:15
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        super();

    }

    public Person(String name, int age) {
        super();
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
