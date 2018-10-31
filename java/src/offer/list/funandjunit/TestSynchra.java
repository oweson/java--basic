package offer.list.funandjunit;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/13 0013 17:57
 */
public class TestSynchra {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Fish fish = new Fish();
        System.out.println(fish);
        Class<Fish> fishClass = Fish.class;
        Fish fish1 = fishClass.newInstance();
        System.out.println(fish.equals(fish1) + "sdsdsdsdsssssssssssd");

        System.out.println(Fish.class);
    }
}
