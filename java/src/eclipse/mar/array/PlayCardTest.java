package eclipse.mar.array;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/30 0030 19:38
 */
public class PlayCardTest {
    public static void main(String[] args) {
        // 1 花色数组
        String[] hs = {"黑桃", "红桃", "梅花", "方片"};
        // 2 点数数组
        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        printCard(hs, ds);
    }

    private static void printCard(String[] hs, String[] ds) {
        for (int hs_index = 0; hs_index < hs.length; hs_index++) {
            for (int ds_index = 0; ds_index < ds.length; ds_index++) {
                // 3 拼接字符串
                System.out.print(hs[hs_index] + ds[ds_index] + " ");
            }
            // 4 输出换行
            System.out.println();
        }
    }
}
