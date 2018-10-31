package github.design.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/16 0016 22:33
 */
public class StaticFactory {
    static Sender computer() {
        return new Computer();
    }

    static Sender mobile() {
        return new MobilePhone();
    }
}
