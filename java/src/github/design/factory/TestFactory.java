package github.design.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/16 0016 22:28
 */
public class TestFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Sender computer = factory.createNewInstance("computer");
        computer.sender();

    }
}
