package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 11:18
 */
public class EnumMainTest {
    public static void main(String[] args) {
        Student student = MyEnum.INSTANCE.getStudent();
        Student student02 = MyEnum.INSTANCE.getStudent();
        System.out.println(student);
        System.out.println(student02);

    }
}
