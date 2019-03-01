package pig.yihe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 10:47
 */
public class IsEvenOrOdd {
    /** 判断偶数和基数*/
    public  static boolean demo1(int i){
        return i%2==0;
    }
    public static void main(String[] args) {
        int a=101;
        boolean b = demo1(a);
        boolean b1 = demo1(100);
        System.out.println(b);
        System.out.println(b1);


    }
}
