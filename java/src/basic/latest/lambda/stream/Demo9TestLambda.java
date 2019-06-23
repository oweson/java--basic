package basic.latest.lambda.stream;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月16日 上午10:32:00 类说明：侵权必究。。。。。。。
 */

/**
 * 以下是lambda表达式的重要特征: 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 */
public class Demo9TestLambda {
    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        String sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private String saveMessage(String string, GreetingService greetingService) {
        return greetingService.sayMessage(string);

    }

    public static void main(String[] args) {
        // 1 不用类型声明
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation addition1 = (a, b) -> a + b;
        MathOperation divv = (a, b) -> a / b;
        // 2 定义除法；

        Demo9TestLambda testLambda01 = new Demo9TestLambda();
        // 函数是编程
        int operate = testLambda01.operate(100, 10, divv);
        System.out.println(operate);
        int operate2 = testLambda01.operate(1, 1, addition);
        System.out.println(operate2);

    }

}
