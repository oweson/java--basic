package basic.pond.math;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 22:07
 */
public class GradeScore {
    public static void main(String[] args) {
        /** 1 模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。

         - 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
         - 定义countScore方法，统计各个阶段的分数个数。
         - 定义printCount方法，打印各个阶段的统计结果。
         */
        Random random = new Random();
        List<Integer> list = getScoreList(random);
        int[] arr = countScore(list);
        printCount(arr);
    }

    private static void printCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("高到底阶段的人数的个数：" + arr[i]);

        }
    }

    private static int[] countScore(List<Integer> list) {
        int[] arr = new int[4];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 80) {
                arr[0]++;
            } else if (list.get(i) < 80 && list.get(i) >= 60) {
                arr[1]++;
            } else if (list.get(i) < 59 && list.get(i) >= 40) {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        return arr;

    }

    private static List<Integer> getScoreList(Random random) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            /**random的nextInt(int n)方法可以生成一个介于0(包含)到n(不包含)之间的整数
             nextInt(101)生成的就是0~100之间的随机数，包含0和100*/
            int number = random.nextInt(100) + 1;
            list.add(number);

        }
        return list;
    }
}
