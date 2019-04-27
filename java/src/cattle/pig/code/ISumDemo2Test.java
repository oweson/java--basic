package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:48
 */
public class ISumDemo2Test {
    public static int a = 1;

    public static void main(String[] args) {
        /**局部变量*/
        int a = 10;
        a++;
        /**成员变量*/
        ISumDemo2Test.a++;

        ISumDemo2Test t = new ISumDemo2Test();
        /**第一个是局部变量，第二个是成员的变量*/
        System.out.println("a=" + a + " t.a=" + t.a);
        /**解析：
         *
         * 值为1的a属于类变量也叫作成员变量，值为10的a是局部变量 首先a＋＋时就近原则，
         * 用局部变量10来加，Text.a直接用类名调用成员变量的情况，
         * 只能是static 修饰的成员变量1来加，然后又实例化了对象，
         * 在输出中第一个a＝ 用就近原则输出11，第二个t.a 对象只能调用类变量输出2*/

    }

}
