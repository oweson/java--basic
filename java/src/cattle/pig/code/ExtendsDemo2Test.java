package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:55
 */
/** 1 class Base
 {
 public void method()
 {
 System.out.println("Base");
 }
 }
 class Son extends Base
 {
 public void method()
 {
 System.out.println("Son");
 }

 public void methodB()
 {
 System.out.println("SonB");
 }
 }
 public class Test01
 {
 public static void main(String[] args)
 {
 Base base = new Son();
 base.method();
 base.methodB();
 }
 };
 解析：Base base=new Son(); 是多态的表示形式。父类对象调用了子类创建了Son对象。
 base调用的method()方法就是调用了子类重写的method()方法。
 而此时base还是属于Base对象，base调用methodB()时Base对象里没有这个方法，所以编译不通过。
 要想调用的话需要先通过SON son=(SON)base;强制转换，然后用son.methodB()调用就可以了。

 二：向上转型，父类的引用无法访问子类独有的方法，
 */
