package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 10:47
 */
public class HungryFish {
    public static final HungryFish HUNGRY_FISH;
    static {
        HUNGRY_FISH=new HungryFish();
    }
    public static final HungryFish getFish(){
        return HUNGRY_FISH;
    }
    public static void main(String[] args) {
        HungryFish fish = HungryFish.getFish();
        HungryFish fish02 = HungryFish.getFish();
        System.out.println(fish==fish02);

    }
}
