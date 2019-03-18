package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:26
 */
public class FishHungry {
    private FishHungry() {
    }

    private static FishHungry fishHungry = new FishHungry();

    public static FishHungry getFishHungry() {
        return fishHungry;
    }

    public static void main(String[] args) {
        FishHungry fishHungry = getFishHungry();
        FishHungry fishHungry02 = getFishHungry();
        System.out.println(fishHungry);
        System.out.println(fishHungry02);
    }
}
