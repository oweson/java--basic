package eclipse.mar.javase.function;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/1 0001 15:26
 */
public class Demo1 {
    public static void printX(int m) {

        for (int x = 1; x <= m; x++) {
            //循环7行
            for (int y = 1; y <= m; y++) {
                //循环7列
                if (x == y || x + y == m + 1) {
                    //对角线打印O
                    System.out.print("O");
                } else {
                    System.out.print("*");
                    //其他位置打印.
                }
            }
            System.out.println();//换行
        }
    }

    public static void main(String[] args) {
        printX(10);

    }
}
