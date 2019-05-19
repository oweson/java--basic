package basic.latest.jdk18;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/10 0010 21:12
 */
public interface NewInterfaceTest {
    /**  1 静态方法和默认方法的作用：

     静态方法和默认方法都有自己的方法体，默认方法用于提供一套默认的实现，
     这样子类对于该方法就不需要强制来实现，可以选择使用默认的实现，
     也可以重写自己的实现。当为接口扩展方法时，只需要提供该方法的默认实现即可，
     至于对应的实现类可以重写也可以使用默认的实现，
     这样所有的实现类不会报语法错误：Xxx不是抽象的, 并且未覆盖Yxx中的抽象方法。*/
     static void demo1(){
        System.out.println("static");
    }
    default void  demo2(){
        System.out.println("default");
    }
}
