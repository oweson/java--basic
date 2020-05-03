package basic.latest.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/20 0020 22:07
 */
public class Demo2FilteEmployee {
    private Integer age;
    private String name;

    public Demo2FilteEmployee() {
    }

    public Demo2FilteEmployee(Integer age, String name) {
        this.age = age;
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
        return "Demo2FilteEmployee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 优化方案二，采用匿名内部类，不用new类去实现呢接口
     */
    public static List<Demo2FilteEmployee> filterEmployee03(List<Demo2FilteEmployee> list, IEmployee<Demo2FilteEmployee> fuck) {

        List<Demo2FilteEmployee> list1 = new ArrayList<>();
        for (Demo2FilteEmployee filteEmployee : list) {
            if (fuck.testSth(filteEmployee)) {
                list1.add(filteEmployee);
            }

        }
        return list1;
    }

    /**
     * 第三种使用lambda表达式进行运算
     */
    public static void FilterResultByLambda() {
        //filterEmployee03()

    }

    public static List<Demo2FilteEmployee> filterEmployee02(List<Demo2FilteEmployee> list, IEmployee<Demo2FilteEmployee> listSuper) {

        List<Demo2FilteEmployee> list1 = new ArrayList<>();
        for (Demo2FilteEmployee filteEmployee : list) {
            /*优化方案*/
            if (listSuper.testSth(filteEmployee)) {
                list1.add(filteEmployee);
            }


        }
        return list1;
    }

    public static List<Demo2FilteEmployee> filterEmployee(List<Demo2FilteEmployee> list) {
        List<Demo2FilteEmployee> list1 = new ArrayList<>();
        for (Demo2FilteEmployee filteEmployee : list) {
            if (filteEmployee.getAge() >= 22) {
                list1.add(filteEmployee);
            }


        }
        return list1;
    }

    public static void main(String[] args) {
        System.out.println("y优化2-------------------------------");

        /* 1 过滤年龄大于等于22岁的学生*/
        List<Demo2FilteEmployee> list = Arrays.asList(new Demo2FilteEmployee(21, "ppx"),
                new Demo2FilteEmployee(22, "ppg"));
        /*2 最终版本的优化方式*/
        System.out.println("===============================================");

        list.stream().filter((e) -> e.getAge() >= 21).forEach(System.out::println);
        List<Demo2FilteEmployee> filteEmployeeList = list.stream().filter((e) -> e.getAge() > 0).collect(Collectors.toList());
        System.out.println("===============================================");
        /*3 提取员工名字*/
        System.out.println("===============================================");

        list.stream().map(Demo2FilteEmployee::getName).forEach(System.out::println);
        List<String> stringList = list.stream().map(Demo2FilteEmployee::getName).collect(Collectors.toList());
        System.out.println("===============================================");

        List<Demo2FilteEmployee> list3 = filterEmployee03(list, new IEmployee<Demo2FilteEmployee>() {
            @Override
            public Boolean testSth(Demo2FilteEmployee filteEmployee) {
                return filteEmployee.getAge() >= 21;
            }
        });
        for (Demo2FilteEmployee filteEmployee : list3) {
            System.out.println(filteEmployee);

        }
        System.out.println("优化代码-------------------------------------------");
        List<Demo2FilteEmployee> list2 = filterEmployee02(list, new Demo3FilterEmployee02());
        for (Demo2FilteEmployee filteEmployee : list2) {
            System.out.println("优化的信息打印" + filteEmployee);

        }

        System.out.println("优化代码-------------------------------------------");

        List<Demo2FilteEmployee> list1 = Demo2FilteEmployee.filterEmployee(list);
        for (Demo2FilteEmployee filteEmployee : list1) {
            System.out.println(filteEmployee);

        }


    }
}
