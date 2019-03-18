package top.sea521.algorithm.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 17:36
 */
public class EqualsTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort bubbleSort02 = bubbleSort;
        BubbleSort bb = new BubbleSort();
        System.out.println(bubbleSort);
        System.out.println(bubbleSort02);
        System.out.println(bubbleSort.equals(bubbleSort02));
        // 不重写tostring(),默认比较的是地址；
        System.out.println(bubbleSort.equals(bb));
    }

}
