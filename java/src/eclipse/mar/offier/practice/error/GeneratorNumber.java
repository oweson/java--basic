package eclipse.mar.offier.practice.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/25 0025 21:27
 */
public class GeneratorNumber {
    public static void testGeneratorNum(int num) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < num; i++) {
            int i1 = (int) (Math.random() * 1000);
            //int i1 = (int) Math.random() * 1000;error;
            list.add(i1);

        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);

        }
    }

    public static void main(String[] args) {
        GeneratorNumber.testGeneratorNum(100);

    }
}
