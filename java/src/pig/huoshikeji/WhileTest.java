package pig.huoshikeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 18:48
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i > 3) {
                break;
            }
            if (i < 3 || i == 3) {
                // 无限循环  if (i < 3)
                System.out.println("i小于3");
                System.out.println("第：" + i + "次！");
                i++;
                continue;
            }
            System.out.println("final");
        }
    }
}
