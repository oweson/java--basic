package top.sea521.factory.decorator.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 8:56
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "脆饼咯，刚出锅的.....";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
