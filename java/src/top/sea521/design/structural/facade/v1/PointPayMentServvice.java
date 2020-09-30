package top.sea521.design.structural.facade.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 9:19
 */
public class PointPayMentServvice {
    public boolean pay(PointGifts pointGifts) {
        System.out.println("支付成功：" + pointGifts.getName());
        return true;
    }
}
