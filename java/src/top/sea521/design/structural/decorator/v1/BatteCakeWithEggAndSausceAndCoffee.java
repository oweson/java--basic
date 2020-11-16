package top.sea521.design.structural.decorator.v1;

/**
 * @author oweson
 * @date 2020/11/16 9:07
 */


public class BatteCakeWithEggAndSausceAndCoffee extends BatteCakeWithEggAndSausce {
    @Override
    public String getDesc() {
        return super.getDesc()+"来一杯云南咖啡";
    }

    @Override
    public int cost() {
        return super.cost()+15;
    }
}
