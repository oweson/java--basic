package basic.pond.a_interface;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/12 19:55
 */
public abstract class LandAnimal implements Animal {
    @Override
    public void eat() {
        System.out.println("eat!");
    }

    @Override
    public void sleep() {
        System.out.println("sleep!");

    }
}
