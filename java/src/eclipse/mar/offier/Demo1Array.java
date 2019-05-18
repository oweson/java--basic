package eclipse.mar.offier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/18 0018 21:32
 */
public class Demo1Array {
    public static void main(String[] args) {
        int a[] = new int[100];
        a[0] = 100;
        a[1] = 200;
        /**动态初始化数据*/
        int b[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        /**数组的静态初始化*/
        System.out.println(a.length);
        System.out.println(a.toString());
    }
}
