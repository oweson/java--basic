package top.sea521.design.structural.facade.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/1 0001 16:24
 */
public class User {
    public static void main(String[] args) {
        /*外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
         * 而外观模式就是将他们的关系放在一个Facade类中，
         * 降低了类与类之间的耦合度，该模式中没有涉及到接口，看下类图：（我们以一个计算机的启动过程为例）*/
        Computer computer = new Computer();
        computer.startup();
        System.out.println("================================================================================");
        computer.shutdown();
    }
}
