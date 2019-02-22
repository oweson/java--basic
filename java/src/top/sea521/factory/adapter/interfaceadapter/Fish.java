package top.sea521.factory.adapter.interfaceadapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/22 0022 17:09
 */
public class Fish extends Adapter {
    public static void main(String[] args) {
        new Fish().eat();

    }

    @Override
    public void eat() {
        System.out.println("吃饭啦");

    }
}
