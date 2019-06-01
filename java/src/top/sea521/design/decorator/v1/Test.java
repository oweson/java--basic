package top.sea521.design.decorator.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 8:49
 */
public class Test {
    public static void main(String[] args) {
        // 1 原生的卖煎饼
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + "消耗：" + batterCake.cost());
        // 2 加蛋
        BatterCake batterCake1 = new BatterCakeWithEge();
        System.out.println(batterCake1.getDesc() + "   " + batterCake1.cost());
        // 3 加火腿和鸡蛋
        BatterCake batterCake2 = new BatteCakeWithEggAndSausce();
        System.out.println(batterCake2.getDesc() + "   需要支付   :" + batterCake2.cost());

    }
}
