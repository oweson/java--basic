package basic.pond.math;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 21:38
 */
public class CountGeneratorNumberTimes {
    public static void main(String[] args) {
        /** 1 统计数字出现次数。

         - 定义getNumList方法，随机生成100个数字，数字范围从1到10。
         - 定义printCount方法，统计每个数字出现的次数并打印到控制台。
         */
        Random r = new Random();
        List<Integer> numberList = getNumberList();
        printList(numberList);

    }

    // 对应保存数字出现的次数
    private static void printList(List<Integer> numberList) {
        int count[] = new int[10];
        for (int i = 0; i < numberList.size(); i++) {
            Integer integer = numberList.get(i);
           // count[integer]++;
            count[integer-1]++;

        }
        // 打印数字和次数
        for (int i = 0; i < count.length; i++) {
            System.out.println("数字" + (i + 1) + "出现了" + count[i] + "次");

        }

    }

    private static List<Integer> getNumberList() {
        Random random = new Random();
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10) + 1;
            list.add(i1);

        }
        return list;
    }
}
