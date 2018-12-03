package top.sea521.factory.proxy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 16:01
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("dao的调用.....................");
        return iOrderDao.insertOrder(order);
    }
}
