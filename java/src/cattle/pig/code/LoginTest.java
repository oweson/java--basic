package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/12 0012 13:43
 */
public class LoginTest {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        if (++i > 0 || ++j > 0) {
            System.out.println(i);//1
            System.out.println(j);//0
        }
        int i2 = 0;
        for (i2 = 2; i2 <= 10; i2++) {
            System.out.println(i2);
        }
        /**看清题目的所问！！！*/
        System.out.println(i2 + "   ");
    }
}
