package basic.river.interfaceandmanystate.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    @Override
    public void methodCommon() {

    }

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }

}
