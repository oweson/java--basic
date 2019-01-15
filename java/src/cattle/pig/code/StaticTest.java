package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/12 0012 13:16
 */
public class StaticTest {
    public static StaticTest staticTest = new StaticTest();
    public static StaticTest staticTest02 = new StaticTest();

    {
        System.out.println("创建对象啦");
    }

    static {
        System.out.println("第一次也是最后一次.....");
    }

    public static void main(String[] args) {
        /**创建对象啦
         创建对象啦
         第一次也是最后一次.....
         创建对象啦*/
        new StaticTest();

    }
}
