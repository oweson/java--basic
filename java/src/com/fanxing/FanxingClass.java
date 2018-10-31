package com.fanxing;
/**反省类的使用*/
public class FanxingClass<T> {
    private T age;
    private  T name;
    /**泛型方法*/
    public void show_1(T t){
        System.out.println(t.toString());
    }
    public <E> void show_3(E t){
        System.out.println(t.toString());
    }
    public <T>void show(T t){
        System.out.println(t.toString());
    }
    /***/

    public T getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "fruit";
    }

    public FanxingClass() {
    }

    public FanxingClass(T age, T name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public static void main(String[] args) {
        /**1可以调用*/
        Apple apple = new Apple();
        FanxingClass<Fruit> fruitFanxingClass = new FanxingClass<>();
        fruitFanxingClass.show_1(apple);
        fruitFanxingClass.show(21);

       /* FanxingClass<Integer> fanxingClass = new FanxingClass<>();
fanxingClass.setAge(21);
        System.out.println(fanxingClass.getAge());
        FanxingClass<String> fanxingClass1 = new FanxingClass();
        fanxingClass1.setName("程万里");
        System.out.println(fanxingClass1.getName());*/
    }
}
