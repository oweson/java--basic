package top.sea521.factory.proxy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 15:59
 */
public interface IOrderDao {
    /**和业务无关*/
    int insertOrder(Order order);
}
