package top.mooc.playdataStructure.second.array.array;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/8 0008 11:47
 */
public class Demo1Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 99, 66};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int score : scores) {
            System.out.println(score);
        }

        scores[0] = 96;

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}

