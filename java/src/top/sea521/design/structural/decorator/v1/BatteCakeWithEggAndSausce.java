package top.sea521.design.structural.decorator.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 8:47
 */
public class BatteCakeWithEggAndSausce extends BatterCakeWithEge {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个火腿";
    }

    @Override
    public int cost() {
        return super.cost()+10;
    }
}
