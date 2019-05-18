package eclipse.mar.offier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/22 0022 20:39
 */
public class AllCircle02 {
    /**递归循环，无限循环*/
    public static void say(){
        say();
    }
    public static void main(String[] args) {
        say();

    }
}
