package pig.yihe;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 20:42
 */
public class Simple01 {
    //@MainTest
    public void demo1(){
        //private String s="";不允许
    }

    public int demo2(final int a){
       // return ++a;  final修饰的形参不能运算在局部函数；
        return a;

    }
    public static void main(String[] args) {

    }
}

abstract class A {
    // 1 抽象类可以有private属性；
    private int a=100;
   // 2 private abstract void demo3();两个修饰符号冲突；

}
