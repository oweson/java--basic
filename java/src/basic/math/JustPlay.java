package basic.math;

import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 21:55
 */
public class JustPlay {
    public static void main(String[] args) {
        List<Integer> list02 = new Vector<>(1000);
        List<Integer> list03 = new Vector<>(10000);
        List<Integer> list04 = new Vector<>(100000);
        List<Integer> list05 = new Vector<>(1000000);
        List<Integer> list06 = new Vector<>(10000000);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            demo1(random);

        }
    }

    private static void demo1(Random random) {
        List<Integer> list = new Vector<>(1000000);

        for (int i = 0; i < 10; i++) {
            int nextInt = random.nextInt(19);
            list.add(nextInt);

        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);

        }
        int i = sum / 10;
        System.out.println("平均数字是"+i);
    }
}
