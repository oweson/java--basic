package basic.latest.StreamAndMethodReference.demo09.ConstructorMethodReference;

/**
 * 类的构造器(构造方法)引用
 */
public class Demo {
    /**
     * 1 定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
     */
    private static void printName(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //1 调用printName方法,方法的参数PersonBuilder接口是一个函数式接口,可以传递Lambda
        printName("迪丽热巴", Person::new);

        /*
            2 使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        //使用Person类的带参构造方法,通过传递的姓名创建对象
        printName("裴秀智",Person::new);
    }
}
