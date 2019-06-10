package top.sea521.design.strategy;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:40
 */
public class MainTest {
    public double calc(Strategy strategy, double paramA, double paramB) {
        Calc calc = new Calc();
        calc.setStrategy(strategy);
        return calc.calc(paramA, paramB);
    }

    public static void main(String[] args) {
        MainTest myClass = new MainTest();
        System.out.println("Calculation Add  " + myClass.calc(new AddStrategy(), 10, 5));
        System.out.println("Calculation Add  " + myClass.calc(new SubStrategy(), 10, 5));
    }
}
