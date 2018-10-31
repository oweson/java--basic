package eclipse.mar.manyfun;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月20日 上午8:27:43 类说明：侵权必究。。。。。。。
 */

public class TestFuns {
    int total = 0;

    public int set(int a) {
        return a;

    }

    public void demo1(List<Integer> list) {
        for (Integer integer : list) {

            int set = set(integer);
            total += set;

        }
        System.out.println(total);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(210);

        list.add(2100);
        list.add(210000);
        TestFuns testFuns = new TestFuns();
        testFuns.demo1(list);

    }

}
