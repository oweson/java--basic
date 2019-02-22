package top.sea521.factory.proxy.staticproxy02;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/22 0022 17:33
 */
public class SaleProxy implements BuyHouse {
    private BuyHouse buyHouse;

    public SaleProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("准备");
        buyHouse.buyHouse();
        System.out.println("装修");

    }
}
