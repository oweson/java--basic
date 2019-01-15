package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 17:35
 */
public class StaticTest02 {
    static int cnt = 6;

    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println("cnt =" + cnt);
        //5
    }

    static {
        cnt /= 3;
    }

    private static int a=100;
}
