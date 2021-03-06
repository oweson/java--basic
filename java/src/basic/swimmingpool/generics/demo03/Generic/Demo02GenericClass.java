package basic.swimmingpool.generics.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        // 1 不写泛型默认为Object类型,啥都行；
        GenericClass gc = new GenericClass();
        gc.setName(57034720);
        Object obj = gc.getName();
        System.out.println(obj);

        // 2 创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1001201290);
        Integer name = gc2.getName();
        System.out.println(name);

        // 3 创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
