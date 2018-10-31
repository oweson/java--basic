package offer.list;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 15:14
 */
public class HungerManDesign {
    /**
     * 懒汉设计模式
     */
    private static HungerManDesign hungerManDesign;

    private HungerManDesign() {
        System.out.println("singleton");
    }

    public static HungerManDesign getInstance() {
        if (hungerManDesign == null) {
            synchronized (HungerManDesign.class) {
                if (hungerManDesign == null) {
                    return new HungerManDesign();
                }
            }
        }
        return hungerManDesign;
    }

}
