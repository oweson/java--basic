package top.sea521.design.creational.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 11:18
 */
public class Demo1EnumMainTest {
    public static void main(String[] args) {
        Student student = Demo1EnumMain.INSTANCE.getStudent();
        Student student02 = Demo1EnumMain.INSTANCE.getStudent();
        System.out.println(student);
        System.out.println(student02);

    }
}
