package top.sea521.design.Flyweight;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:26
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        drawByXiaoMing();
        drawByXiaoHong();
    }

    public static void drawByXiaoMing() {
        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("草");

        ICrayon grayCrayon = CrayonFactory.getCrayon("灰色");
        grayCrayon.draw("路");
    }

    public static void drawByXiaoHong() {
        /**平时开发过程中经常见到这种因为很多重复的对象，所以利用享元模式来实现的场景。
         * 享元模式合理提高了对象的复用性，减少了程序的内存占用，
         * 还有一个提高性能的地方就是减少了对象创建的过程。好了，收下这个简单的设计模式。*/
        ICrayon blueCrayon = CrayonFactory.getCrayon("蓝色");
        blueCrayon.draw("蓝天");

        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("树");
    }

}
