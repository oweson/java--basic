package top.sea521.day01;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/10 0010 7:39
 */
public class Parent {
    static {
        System.out.println("static");
    }
    {
        System.out.println("static of parent constructer");
    }
    public Parent(){
        System.out.println("im parent constaructro");
    }
}
