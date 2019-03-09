package pig.huoshikeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 18:57
 */
public class Fish02 {
    int a;
    public static void change(Fish02 fish02){
        fish02=new Fish02();
        fish02.a=3;
    }

    public static void main(String[] args) {
        Fish02 fish = new Fish02();
        change(fish);
        System.out.println(fish.a);
        // 0

    }
}
