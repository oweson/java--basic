package eclipse.mar.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:58
 */
public class Fanshe {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("eclipse.mar.thread.Fanshe");
        aClass.getClass().getInterfaces();
        System.out.println(aClass);
    }
}
