package top.sea521.design.structural.decorator.v3;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 16:12
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
