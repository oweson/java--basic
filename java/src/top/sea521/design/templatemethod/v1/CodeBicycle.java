package top.sea521.design.templatemethod.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:09
 */
public class CodeBicycle extends AbstractClass {
    @Override
    public void unlock() {
        System.out.println("密码开锁");
    }

    @Override
    public void ride() {
        System.out.println("骑起来很拉风");
    }

    @Override
    public void lock() {
        System.out.println("上锁");
    }

    @Override
    public void pay() {
        System.out.println("结算");
    }

    @Override
    public void use() {
        unlock();
        ride();
        lock();
        pay();
    }
}
