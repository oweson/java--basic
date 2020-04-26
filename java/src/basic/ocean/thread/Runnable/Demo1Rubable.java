package basic.ocean.thread.Runnable;

import basic.latest.StreamAndMethodReference.demo04.MethodReference.Printable;

import java.util.function.DoubleBinaryOperator;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/10/21 0021 20:59
 */
public class Demo1Rubable {
    public static void main(String[] args) {
        Runnable runnable= () ->System.out.println("hello");
        new Thread(runnable).start();
        DoubleBinaryOperator uncaughtExceptionHandler = (x, y) -> Math.pow(x, y);
        System.out.println(uncaughtExceptionHandler);
        Printable printable = (x) -> Math.abs(100);
        System.out.println(printable);

    }
}
