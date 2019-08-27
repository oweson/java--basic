package pig;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/27 7:09
 */
public class IncTest {
    public static void main(String[] args) {
        IncTest incTest = new IncTest();
        int i = 0;
        int a = 0;
        incTest.add(i);
        /**假如赋值给a就是1，然而是赋值给i,i=0,然后在计算加的1和i没关系*/
        i = i++;
        System.out.println(i);
        // 0
    }

    private void add(int i) {
        i++;
    }
}
