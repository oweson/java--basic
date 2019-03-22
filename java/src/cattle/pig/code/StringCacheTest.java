package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 10:42
 */
public class StringCacheTest {
    public static void main(String args[]) {
        String str = new String("hello");
        if (str == "hello") {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        /**new 出来的东西和常量池比较返回false;*/
        String ppx = new String("ppx");
        String ppg = "ppx";
        System.out.println(ppx == ppg);
        // false false;
        System.out.println(ppg == "ppx");
        // true
    }
}
