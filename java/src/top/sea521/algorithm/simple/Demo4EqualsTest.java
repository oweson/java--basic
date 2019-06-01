package top.sea521.algorithm.simple;

import top.sea521.algorithm.sorts.BubbleSort;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 17:36
 */
public class Demo4EqualsTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort bubbleSort02 = bubbleSort;
        BubbleSort bubbleSort03 = new BubbleSort();
        System.out.println(bubbleSort);
        System.out.println(bubbleSort02);
        // 两个引用同一个对象
        System.out.println(bubbleSort.equals(bubbleSort02));
        // 不重写tostring(),默认比较的是地址；
        System.out.println(bubbleSort.equals(bubbleSort03));
    }

}
