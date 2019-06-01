package top.sea521.design.facade.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 9:30
 */
public class Test {
    public static void main(String[] args) {
        PointGifts pointGifts = new PointGifts("nubia");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setQulafyService(new QulafyService());
        giftExchangeService.setPointPayMentServvice(new PointPayMentServvice());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftChange(pointGifts);

    }
}
