package basic.pond.array.core;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/31 0031 11:42
 */
public class Demo5 {
    public static void main(String[] args) {
        /**统计高于平均分的分数有多少个。

         - 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
         - 定义getAvg方法，获取一个数组中的平均数
         */
        int[] a = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        countAvg(a);
    }

    private static void countAvg(int[] p0) {
        int sum = 0;
        for (int i = 0; i < p0.length; i++) {
            sum += p0[i];

        }
        int avg = sum / p0.length;
        int count = 0;
        for (int i = 0; i < p0.length; i++) {
            if (p0[i] > avg) {
                count++;
            }

        }
        System.out.println("大于平均分的个数" + count);
    }
}
