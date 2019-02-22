package top.sea521.factory.proxy.staticproxy02;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/22 0022 17:37
 */
public class MainServer {
    public static void main(String[] args) {
        BuyHouse buyHouse = new Oweson();
        Oweson buyHouse02 = new Oweson();
        buyHouse.buyHouse();
        SaleProxy saleProxy = new SaleProxy(buyHouse);
        SaleProxy saleProxy02 = new SaleProxy(buyHouse);
        saleProxy.buyHouse();
        saleProxy02.buyHouse();

    }
}
