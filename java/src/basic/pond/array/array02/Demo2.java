package basic.pond.array.array02;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/31 0031 11:35
 */
public class Demo2 {
    private static void printCard(String[] hs, String[] ds) {
        for (int i = 0; i < hs.length; i++) {
            for (int i1 = 0; i1 < ds.length; i1++) {
                System.out.print(hs[i] + ds[i1] + ",");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // 花色数组
        String[] hs = {"黑桃", "红桃", "梅花", "方片"};
        // 点数数组
        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        printCard(hs,ds);

    }
}
