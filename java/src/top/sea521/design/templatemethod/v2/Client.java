package top.sea521.design.templatemethod.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:16
 */
public class Client {
    public static void main(String[] args) {
        /**模板方法模式的优缺点
         优点
         1）良好的封装性。把公有的不变的方法封装在父类，而子类负责实现具体逻辑。

         2）良好的扩展性：增加功能由子类实现基本方法扩展，符合单一职责原则和开闭原则。

         3）复用代码。

         缺点
         1）由于是通过继承实现代码复用来改变算法，灵活度会降低。

         2）子类的执行影响父类的结果，增加代码阅读难度。

         总结
         模板方法模式看上去简单，但是整个模式涉及到的都是面向对象设计的核心，比如继承封装，基于继承的代码复用，
         方法的实现等等。当中还有涉及到一些关键词的使用，也是我们Java编程中需要掌握的基础*/
        ScanBicycle scanBicycle = new ScanBicycle();
        scanBicycle.isNeedUnlock(false);
        scanBicycle.use();

        CodeBicycle codeBicycle = new CodeBicycle();
        codeBicycle.use();
    }
}
