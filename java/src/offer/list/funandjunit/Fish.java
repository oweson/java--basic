package offer.list.funandjunit;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/13 0013 10:22
 */
public class Fish extends Animal {
    @Override
    public void demo1() {
        System.out.println("11111111111");
    }

    @Override
    public void demo2() {
        System.out.println("22222222222222222222222222");

    }

    @Override
    public void demo3() {
        System.out.println("333333333333333333");

    }

    public static void main(String[] args) {
        Animal a = new Fish();
        a.invoke();

    }
}
