package office.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 17:36
 */
public class EqualsTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort bubbleSort02 = bubbleSort;
        System.out.println(bubbleSort);
        System.out.println(bubbleSort02);
        System.out.println(bubbleSort.equals(bubbleSort02));
    }

}
