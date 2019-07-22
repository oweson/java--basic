package pig.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/20 0020 16:42
 */
public class Demo4FinalTest {
    public void printStr(final String str) {

        //str =str+"!";

    }

    public static void main(String[] args) {
        System.out.println("he121212121212121221");
        // 1 final修饰的局部不能赋值运算；
        new Demo4FinalTest().printStr("aa");

        String s;
        //System.out.println("s=" + s);
        // 2 编译不会通过！未初始化！

    }
}
