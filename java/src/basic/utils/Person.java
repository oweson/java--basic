package basic.utils;

import java.util.Objects;

/**
 * @Author:oweson
 * @Date :2018/5/23 0023 22:10
 * @色厉而胆薄，好谋而寡断
 */
public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public void eat() {
        System.out.println("今天吃了一顿金钱豹");
    }

    public void eat(int num) {
        System.out.println("今天吃了" + num + "顿金钱豹");
    }
}
