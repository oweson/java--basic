package top.sea521.design.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 17:56
 */
public class MyEnumTest {
    public static void main(String[] args) {
        Student student = Demo1EnumMain.INSTANCE.getStudent();
        Student student02 = Demo1EnumMain.INSTANCE.getStudent();
        System.out.println(student);
        System.out.println(student02);
        student.say();

    }
}
