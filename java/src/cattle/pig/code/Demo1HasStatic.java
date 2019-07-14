package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/8 0008 16:51
 */
public class Demo1HasStatic {
    private static int x = 100;
    private int y=100;

    public static void main(String args[]) {
        /**因为x的 修饰符为 static 所以x为类变量，即对于所有的实例来说，
         * 他们访问的x为同一个x，类变量存储在方法区，不属于每个实例的私有，
         * 成员变量为每个对象私有化！！！*/
        Demo1HasStatic hs1 = new Demo1HasStatic();
        hs1.x++;
        hs1.y++;
        Demo1HasStatic hs2 = new Demo1HasStatic();
        hs2.x++;
        hs2.y++;
        hs1 = new Demo1HasStatic();
        hs1.x++;
        Demo1HasStatic.x--;
        System.out.println("x=" + x);
        System.out.println("y = "+hs2.y);
    }
}
