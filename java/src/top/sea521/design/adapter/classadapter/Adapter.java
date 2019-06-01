package top.sea521.design.adapter.classadapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 16:01
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
