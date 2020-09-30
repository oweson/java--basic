package top.sea521.design.structural.facade.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 9:17
 */
public class QulafyService {
    public boolean isAvaliable(PointGifts pointGifts) {
        System.out.println("校验；" + pointGifts.getName() + "通过了，库存很多");
        return true;
    }
}
