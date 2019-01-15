package pig.huyu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/4 0004 19:33
 */
public class IntegerTest {
    /**
     * Java之中只存在传值，只有在C#里才有传引用这个概念，java中传也是传的内存的地址。
     * 这里传值把Integer类型的0传过去，并不影响i的值，只是add3方法里面的形式参数的值变化了，
     * 最后输出的还是原来的i，而不是3.
     * 你只要定义1个成员变量i 就可以输出3了，因为 形参i与实参是一样的，方法中变化的就是实参的值。
     */
    public static void add3(Integer i) {
        int val = i.intValue();
        val += 3;
        i = new Integer(val);
    }

    public static void main(String args[]) {
        Integer i = new Integer(0);
        add3(i);
        System.out.println(i.intValue());
    }
}
