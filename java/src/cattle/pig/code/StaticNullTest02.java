package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 10:47
 */
public class StaticNullTest02 {
    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        StaticNullTest02 test = null;
        // 静态属于类的！！！
        StaticNullTest02.hello();
    }
}






