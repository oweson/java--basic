package top.sea521.compariable;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 19:59
 */
public class Bird {
    private int age;
    private String name;

    public Bird(int age, String name) {
        this.age = age;
        this.name = name;
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
        return "Bird{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
