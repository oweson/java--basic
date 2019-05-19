package top.sea521.design.proxy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 16:00
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insertOrder(Order order) {
        System.out.println("成功的插入数据！");
        return 1;
    }
}
