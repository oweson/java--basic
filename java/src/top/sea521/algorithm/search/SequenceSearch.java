package top.sea521.algorithm.search;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 21:55
 */
public class SequenceSearch {
    public static void main(String[] args) {
        int[] list = {90, 10, 20, 50, 70, 40, 80, 60, 30, 52};
        System.out.println("************顺序查找************");
        display(list);
        System.out.println("");

        int result = sequenceSearch(list, 50);
        if (result != -1) {
            System.out.println("50在列表中的位置是：" + result);
        } else {
            System.out.println("对不起，列表中不存在该元素！");
        }
    }

    /**
     * 顺序查找
     */
    public static int sequenceSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            // 找到该元素，返回位置序号
            if (list[i] == key) {
                return i;
            }
        }
        // 没有找到
        return -1;
    }

    /**
     * 遍历打印
     */
    public static void display(int[] list) {
        System.out.println("********展示开始********");
        if (list != null && list.length > 0) {
            for (int num :
                    list) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
        System.out.println("********展示结束********");
    }
}
