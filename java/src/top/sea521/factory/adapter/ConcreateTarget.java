package top.sea521.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/30 0030 14:21
 */
public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("target的实现类");
    }
}
