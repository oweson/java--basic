package pig.zhongwang;

/**
 * @author chengwanli
 * @date 2020/10/14 20:48
 */


public class Animal {
    static {
        System.out.println("animal static!");
    }

    public Animal() {
        System.out.println("animal constrctor!");
    }

    {
        System.out.println("animal 普通代码快！");
    }
}
