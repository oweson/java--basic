package top.sea521.design.structural.decorator.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 8:45
 */
public class BatterCakeWithEge extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
