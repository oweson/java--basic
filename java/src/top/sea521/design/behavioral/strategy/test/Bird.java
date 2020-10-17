package top.sea521.design.behavioral.strategy.test;

/**
 * @author chengwanli
 * @date 2020/10/16 11:16
 */


public class Bird implements Animal {
    @Override
    public void eat(int a, int b) {
        System.out.println(a-b);
    }
}
