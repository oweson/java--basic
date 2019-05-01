package eclipse.mar.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/20 0020 16:42
 */
public class FinalTest {
    public void printStr(final String str)

    {

       //str =str+"!";

    }

    public static void main(String[] args) {
        System.out.println("he121212121212121221");
        // final修饰的局部不能赋值运算；
        new FinalTest().printStr("aa");

        String s;
        //System.out.println("s=" + s);
        // 编译不会通过！

    }
}
