package github.design.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/16 0016 22:34
 */
public class TestStaticFactory {
    /**
     * 静态fun不能调用静态fun，但是类可以
     * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
     */
    public static void main(String[] args) {

        Sender computer = StaticFactory.computer();
        Sender mobile = StaticFactory.mobile();
        computer.sender();
        mobile.sender();
    }
}
