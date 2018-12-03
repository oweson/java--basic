package top.sea521.javamiddle.demo2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/25 0025 18:29
 */
public class Fish implements Comparable<Fish> {
    private Integer age;
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Fish o) {
        if (age < o.getAge()) {
            return 1;
        }
        if (age > o.getAge()) {
            return -1;
        }
        return 0;
    }
}
