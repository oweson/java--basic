package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:41
 */
public class FinalTest {
    /** 1 下面有关java final的基本规则，描述错误的是？
     正确答案: B   你的答案: B
     final修饰的类不能被继承
     final修饰的成员变量只允许赋值一次，且只能在类方法赋值
     final修饰的局部变量即为常量，只能赋值一次。
     final修饰的方法不允许被子类覆盖
     解析：final修饰的成员变量为基本数据类型是，在赋值之后无法改变。
     当final修饰的成员变量为引用数据类型时，在赋值后其指向地址无法改变，但是对象内容还是可以改变的。
     final修饰的成员变量在赋值时可以有三种方式。1、在声明时直接赋值。2、在构造器中赋值。3、在初始代码块中进行赋值；

     final修饰的方法，不允许被子类覆盖。
     final修饰的类，不能被继承。
     final修饰的变量，不能改变值。
     final修饰的引用类型，不能再指向别的东西，但是可以改变其中的内容。；

     final所修饰的成员变量只能赋值一次，可以在类方法中赋值，也可以在声明的时候直接赋值，而final修饰的局部变量可以在声明的时候初始化，
     也可以在第一次使用的通过方法或者表达式给它赋值。*/
}
