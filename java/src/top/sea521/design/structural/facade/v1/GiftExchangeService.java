package top.sea521.design.structural.facade.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 9:24
 */
public class GiftExchangeService {
    /**
     * 注入服务
     */
    private QulafyService qulafyService;
    private ShippingService shippingService;
    private PointPayMentServvice pointPayMentServvice;

    public void setQulafyService(QulafyService qulafyService) {
        this.qulafyService = qulafyService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void setPointPayMentServvice(PointPayMentServvice pointPayMentServvice) {
        this.pointPayMentServvice = pointPayMentServvice;
    }

    public void giftChange(PointGifts pointGifts) {
        if (qulafyService.isAvaliable(pointGifts)) {
            if (pointPayMentServvice.pay(pointGifts)) {
                String s = shippingService.orderNo(pointGifts);
                System.out.println("下单成功，物流号是：" + s);
            }
        }
    }
}
