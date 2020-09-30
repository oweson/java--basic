package top.sea521.design.structural.facade.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 9:20
 */
public class ShippingService {
    public String orderNo(PointGifts pointGifts) {
        System.out.println("进入物流系统" + pointGifts.getName());
        String number = "123123";
        return number;
    }
}
