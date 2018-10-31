package offer.list;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 15:17
 */
public class TestHungerManDesign {
    public static void main(String[] args) {
        HungerManDesign instance = HungerManDesign.getInstance();
        HungerManDesign instance1 = HungerManDesign.getInstance();
        System.out.println(instance.equals(instance1));
        System.out.println(instance1);
    }
}
