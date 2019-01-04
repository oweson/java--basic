package pig.javase.abstract_class;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/1 0001 15:39
 */
public class C extends B {
    int numc = 30;

    @Override
    public void showA() {
        /**继承过来的！！！*/
        System.out.println("A类中numa:" + numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:" + numb);

    }

    public void showC() {
        System.out.println("C类中numc:" + numc);
    }
}
