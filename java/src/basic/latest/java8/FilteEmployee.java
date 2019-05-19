package basic.latest.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/20 0020 22:07
 */
public class FilteEmployee {
    private Integer age;
    private String name;

    public FilteEmployee() {
    }

    public FilteEmployee(Integer age, String name) {
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
        return "FilteEmployee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 优化方案二，采用匿名内部类，不用newl类去实现呢接口
     */
    public static List<FilteEmployee> filterEmployee03(List<FilteEmployee> list, IEmployee<FilteEmployee> fuck) {

        List<FilteEmployee> list1 = new ArrayList<>();
        for (FilteEmployee filteEmployee : list) {
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

    public static List<FilteEmployee> filterEmployee02(List<FilteEmployee> list, IEmployee<FilteEmployee> listSuper) {

        List<FilteEmployee> list1 = new ArrayList<>();
        for (FilteEmployee filteEmployee : list) {
            /**优化方案*/
            if (listSuper.testSth(filteEmployee)) {
                list1.add(filteEmployee);
            }


        }
        return list1;
    }

    public static List<FilteEmployee> filterEmployee(List<FilteEmployee> list) {
        List<FilteEmployee> list1 = new ArrayList<>();
        for (FilteEmployee filteEmployee : list) {
            if (filteEmployee.getAge() >= 22) {
                list1.add(filteEmployee);
            }


        }
        return list1;
    }

    public static void main(String[] args) {
        System.out.println("y优化2-------------------------------");

        /**过滤年龄大于等于22岁的学生*/
        List<FilteEmployee> list = Arrays.asList(new FilteEmployee(21, "ppx"),
                new FilteEmployee(22, "ppg"));
        /**最终版本的优化方式*/
        System.out.println("===============================================");

        list.stream().filter((e) -> e.getAge() >= 21).forEach(System.out::println);
        System.out.println("===============================================");
/**提取员工名字*/
        System.out.println("===============================================");

        list.stream().map(FilteEmployee::getName).forEach(System.out::println);
        System.out.println("===============================================");

        List<FilteEmployee> list3 = filterEmployee03(list, new IEmployee<FilteEmployee>() {
            @Override
            public Boolean testSth(FilteEmployee filteEmployee) {
                return filteEmployee.getAge() >= 21;
            }
        });
        for (FilteEmployee filteEmployee : list3) {
            System.out.println(filteEmployee);

        }
        System.out.println("优化代码-------------------------------------------");
        List<FilteEmployee> list2 = filterEmployee02(list, new FilterEmployee02());
        for (FilteEmployee filteEmployee : list2) {
            System.out.println("优化的信息打印" + filteEmployee);

        }

        System.out.println("优化代码-------------------------------------------");

        List<FilteEmployee> list1 = FilteEmployee.filterEmployee(list);
        for (FilteEmployee filteEmployee : list1) {
            System.out.println(filteEmployee);

        }


    }
}
