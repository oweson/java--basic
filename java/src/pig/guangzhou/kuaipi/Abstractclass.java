package pig.guangzhou.kuaipi;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/12 0012 22:58
 */
public abstract class Abstractclass {
    int a=9;
    //a=a+9;  不合法
    // 1 abstract和static不能同时出现
    // 2 抽象方法不能有方法体
    // 3 final修饰类
    // 4 不加修饰符
    public abstract void demo1();
}
class  Hi{
    // 成员变量是对象的
    int a=0;
    //a+=9;不合法
    public static void main(String[] args) {
       // a=a+0;

    }
}
