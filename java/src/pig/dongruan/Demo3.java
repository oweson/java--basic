package pig.dongruan;

import org.omg.CORBA.Object;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/16 0016 19:39
 */
public class Demo3 implements A,B,C{
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> forName = Class.forName("pig.dongruan.Demo3");
        Class<?>[] interfaces = forName.getInterfaces();
        System.out.println(interfaces[0].getInterfaces().length);
        System.out.println(interfaces[0].getSuperclass());
        System.out.println(A.class.getSuperclass());

    }
}
interface A  {}
interface B{}
interface C{}
