package top.sea521.design.strategy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:37
 */
public class AddStrategy implements  Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute AddStrategy");
        return paramA + paramB;
    }
}
