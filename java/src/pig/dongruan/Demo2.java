package pig.dongruan;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/15 0015 21:03
 */
public class Demo2 {
    public static void main(String[] args) {
        int a=2;
        int result=(a++>2)?(++a):(a+=3);
        // 做错了！！！！！！！！！！！
        int b=1;
        int c=b++;
        // 先赋值在运算！！！
        System.out.println("c="+c+"b="+b);
        System.out.println(result);
        System.out.println("=====================================");
        int[] arr={};
        int length = arr.length;
        // 数组是lengths属性
        int length1 = "hello".length();
        // string是length方法；


    }
}
