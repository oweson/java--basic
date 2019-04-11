package pig.manaowan;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/23 0023 10:01
 */
public class Demo1 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Demo1 demo2 = new Demo1();
        System.out.println(demo1==demo2);
        System.out.println(demo1.equals(demo2));
        System.out.println(demo1.getClass().getName().equals(demo2.getClass().getName()));
        //false false true
        /** 2 局部的变量不能被static修饰*/

    }
}
