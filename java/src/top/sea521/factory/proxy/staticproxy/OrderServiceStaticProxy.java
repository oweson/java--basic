package top.sea521.factory.proxy.staticproxy;

import top.sea521.factory.proxy.IOrderService;
import top.sea521.factory.proxy.Order;
import top.sea521.factory.proxy.OrderServiceImpl;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 16:07
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforemethod();
        iOrderService = new OrderServiceImpl();
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到router:" + dbRouter);
        afteremethod();
        return iOrderService.saveOrder(order);
    }

    public int beforemethod() {
        return 0;
    }

    public int afteremethod() {
        return 0;
    }
}
