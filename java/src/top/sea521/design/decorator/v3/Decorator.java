package top.sea521.design.decorator.v3;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 16:13
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
