package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:33
 */
public class CompileErrorTest {
    /** 1 对文件名为Test.java的java代码描述正确的是()
     1
     2
     3
     4
     5
     6
     7
     8
     9
     10
     11
     12
     13
     14
     15
     16
     17
     18
     class Person {
     String name = "No name";
     public Person(String nm) {
     name = nm;
     }
     }
     class Employee extends Person {
     String empID = "0000";
     public Employee(String id) {
     empID = id;
     }
     }
     public class Test {
     public static void main(String args[]) {
     Employee e = new Employee("123");
     System.out.println(e.empID);
     }
     }
     解析：编译错误！！！
     子类的构造方法总是先调用父类的构造方法，
     如果子类的构造方法没有明显地指明使用父类的哪个构造方法，
     子类就调用父类不带参数的构造方法。
     而父类没有无参的构造函数，所以子类需要在自己的构造函数中显示的调用父类的构造函数。

     二：父类没有无参的构造函数，所以子类需要在自己的构造函数中显式调用父类的构造函数，
     添加
     super("nm");
     否则报错：
     Implicit super constructor Person() is undefined.
     Must explicitly invoke another constructor
     */
}
