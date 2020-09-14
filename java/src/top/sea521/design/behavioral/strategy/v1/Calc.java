package top.sea521.design.behavioral.strategy.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:40
 */
public class Calc {
    private Strategy mStrategy;

    /**
     * 1 注入对象
     *
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    /**
     * 2 多态调用
     *
     * @param paramA
     * @param paramB
     * @return
     */
    public double calc(double paramA, double paramB) {
        if (mStrategy == null) {
            throw new IllegalStateException("You haven't set the strategy for computing.");
        }
        return mStrategy.calc(paramA, paramB);
    }
}
