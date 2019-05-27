package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/2 0002 9:16
 */
public class Hungry {
    public static final Hungry HUNGRY;
    static {
        HUNGRY=new Hungry();
    }
    public static final Hungry getHungry(){
        return HUNGRY;
    }

    public static void main(String[] args) {
        Hungry hungry = Hungry.getHungry();
        Hungry hungry02 = Hungry.getHungry();
        System.out.println(hungry);
        System.out.println(hungry02);
    }
}
