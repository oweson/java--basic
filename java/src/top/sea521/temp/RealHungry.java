package top.sea521.temp;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/4 0004 9:41
 */
public class RealHungry {
    private static RealHungry realHungry = new RealHungry();

    private RealHungry() {
    }

    public static RealHungry getRealHungry() {
        return realHungry;
    }

    public static void main(String[] args) {
        RealHungry realHungry = getRealHungry();
        RealHungry realHungry02 = getRealHungry();
        System.out.println(realHungry == realHungry02);

    }
}
