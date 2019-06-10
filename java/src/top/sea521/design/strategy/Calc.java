package top.sea521.design.strategy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:40
 */
public class Calc {
    private Strategy mStrategy;

    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public double calc(double paramA, double paramB) {
        if (mStrategy == null) {
            throw new IllegalStateException("You haven't set the strategy for computing.");
        }
        return mStrategy.calc(paramA, paramB);
    }
}
