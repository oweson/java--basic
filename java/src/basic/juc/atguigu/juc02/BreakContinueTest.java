package basic.juc.atguigu.juc02;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/1/11 10:33
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        // 双层循环跳出最内层的循环
        for (int i = 0; i < 3; i++) {
            System.out.println("大的：" + i);
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("小的；" + j);


            }

        }
        // 0 break跳出永真循环
        int number = 0;
        while (true) {
            if (number == 2) {
                break;
            }
            number++;


        }
        // 1 跳出循环
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);

        }
        // 2 结束本次循环，进行下一循环
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
    }
}
