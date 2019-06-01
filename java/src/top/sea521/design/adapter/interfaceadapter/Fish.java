package top.sea521.design.adapter.interfaceadapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/22 0022 17:09
 */
public class Fish extends Adapter {
    /**
     * 接口的适配器模式：当不希望实现一个接口中所有的方法时，
     * 可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
     */
    public static void main(String[] args) {
        new Fish().eat();

    }

    @Override
    public void eat() {
        System.out.println("吃饭啦");

    }
}
