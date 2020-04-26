package pig.aikefa;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 9:48
 */
public class Test {
    public static void main(String[] args) {
        IMovable jett = new AirPlane("Jett");
        /** 1 合法吗？answer:合法没有输出！*/
        jett.move("sky");
        //2 right!------Jettwill fly in thesky
        jett.move("sea");
        // 3 Jettcannot fly in thesea
        IMovable donnie = new SeaPlane("Donnie");
        /** 1 合法吗？合法！*/
        System.out.println("第二个问题-------------------------------");
        donnie.move("sky");
        /** 1 Donniewill fly in thesky自己做错了！！！*/
        donnie.move("sea");
        /** 2 Donniewill fly in thesea--对了！*/


    }
}
