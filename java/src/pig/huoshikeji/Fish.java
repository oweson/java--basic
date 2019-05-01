package pig.huoshikeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 18:54
 */
public class Fish {
    int a;

    public static void change(Fish fish) {
        fish.a = 3;
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        change(fish);
        System.out.println(fish.a);
        // 3
        System.out.println(new Fish().a);
    }
}
