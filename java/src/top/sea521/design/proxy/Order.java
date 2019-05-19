package top.sea521.design.proxy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/1 0001 15:57
 */
public class Order {
    private Object OrderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return OrderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        OrderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
