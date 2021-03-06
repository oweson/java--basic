package top.sea521.compariable;


import java.util.TreeSet;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/21 0025 18:29
 */
public class Demo2FishCompariableTest implements Comparable<Demo2FishCompariableTest> {
    public static void main(String[] args) {
        TreeSet<Demo2FishCompariableTest> set = new TreeSet<Demo2FishCompariableTest>();
        set.add(new Demo2FishCompariableTest(121, "apx"));
        set.add(new Demo2FishCompariableTest(210, "px"));
        set.add(new Demo2FishCompariableTest(2110, "apx"));
        set.add(new Demo2FishCompariableTest(921, "nubia"));
        set.add(new Demo2FishCompariableTest(2121, "honor"));
        set.add(new Demo2FishCompariableTest(211, "oppo"));
        for (Demo2FishCompariableTest fish : set) {
            System.out.println(fish);

        }

    }

    /**
     * Comparable和Comparator接口都是为了对类进行比较，众所周知，诸如Integer，double等基本数据类型，
     * java可以对他们进行比较，
     * 而对于类的比较，需要人工定义比较用到的字段比较逻辑。可以把Comparable理解为内部比较器，
     * 而Comparator是外部比较器
     */
    private Integer age;
    private String name;

    public Demo2FishCompariableTest(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Demo2FishCompariableTest(String name) {
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
    public String toString() {
        return "Demo2FishCompariableTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Demo2FishCompariableTest o) {
        int age = this.getAge() - o.getAge();
        if (age == 0) {
            this.getName().compareTo(o.getName());
        }
        return age;
    }
}
