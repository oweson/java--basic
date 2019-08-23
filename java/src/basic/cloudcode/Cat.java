package basic.cloudcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/22 20:35
 */
public class Cat {
    private int age
            ;
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

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
