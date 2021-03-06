package top.sea521.design.behavioral.templatemethod.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:14
 */
public class ScanBicycle extends AbstractClass {
    @Override
    protected void unlock() {
        System.out.println("========" + "扫码开锁" + "========");
    }

    @Override
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }

    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
}
