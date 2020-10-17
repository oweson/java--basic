package pig.zhongwang;

/**
 * @author chengwanli
 * @date 2020/10/14 20:49
 */


public class Fish extends Animal {
    public Fish(){
        System.out.println("fish constrctor!");
    }
    static {
        System.out.println("fish static!");
    }
    {
        System.out.println("fish 普通代码快！");
    }

    public static void main(String[] args) {
        new Fish();
        System.out.println("--------------------------------------------");
        new  Fish();
        /**D
         animal static!
         fish static!
         animal 普通代码快！
         animal constrctor!
         fish 普通代码快！
         fish constrctor!
         -----------------------------------------------
         animal 普通代码快！
         animal constrctor!
         fish 普通代码快！
         fish constrctor!

         */
        // 加载顺序：  父类静态代码快-》子类静态代码快-》父类普通代码快-》父类构造函数-》-》子类普通代码快-》子类构造函数

    }

}
