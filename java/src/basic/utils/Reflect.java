package basic.utils;


/**
 * @Author:oweson
 * @Date :2018/5/23 0023 22:15
 * @色厉而胆薄，好谋而寡断
 */
public class Reflect {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("eclipse.mar.utils.Person");
        /** 1 全类名*/
        System.out.println(aClass);
        Class<Person> personClass = Person.class;
        Person p = new Person();
        Class clazz3 = p.getClass();

        System.out.println(aClass == personClass);
        System.out.println(aClass== clazz3);

        System.out.println(personClass);
    }
}
