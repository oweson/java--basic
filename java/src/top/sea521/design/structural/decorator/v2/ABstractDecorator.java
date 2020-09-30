package top.sea521.design.structural.decorator.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 8:58
 */
public class ABstractDecorator extends ABatterCake {
    /**父类注入进来*/
    private ABatterCake aBatterCake;

    public ABstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return null;
    }

    @Override
    protected int cost() {
        return 0;
    }
}
