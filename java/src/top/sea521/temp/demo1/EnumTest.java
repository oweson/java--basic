package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/2 0002 9:20
 */
public class EnumTest {
    public static void main(String[] args) {
        EnumOne instance = EnumOne.INSTANCE;
        EnumOne instance02 = EnumOne.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance02.hashCode());
    }
}
