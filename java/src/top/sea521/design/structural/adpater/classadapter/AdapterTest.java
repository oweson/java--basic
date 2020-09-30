package top.sea521.design.structural.adpater.classadapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 16:01
 */
public class AdapterTest {
    public static void main(String[] args) {
        // 这样Targetable接口的实现类就具有了Source类的功能。
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
