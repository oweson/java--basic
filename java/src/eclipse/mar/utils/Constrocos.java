package eclipse.mar.utils;


import java.lang.reflect.Constructor;

/**
 * @Author:oweson
 * @Date :2018/5/23 0023 22:22
 * @色厉而胆薄，好谋而寡断
 */
public class Constrocos {
    public static void main(String[] args) throws Exception {
        /**通过无参数的构造函数创建对象*/
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        person.setAge(21);
        System.out.println(person.getAge());
        Constructor<Person> constructor = personClass.getConstructor(int.class, String.class);
        Person person1 = constructor.newInstance(211, "hello");
        System.out.println(person1.getAge() + person1.getName());

    }
}
