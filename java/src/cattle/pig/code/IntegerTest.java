package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 16:48
 */
public class IntegerTest
{

     static  void change(Integer a){
         a=1000;

     };
    public static void main(String[] args) {
        Integer i = new Integer(10);
        change(i);
        System.out.println(i);
        //10 没有变化？？？
        /** 1 不能改变，虽然Integer是引用类型的，但是没有方法可以改变它的实例变量value。
         * 一般都是直接赋值给它（Integer i = 10; list.add(i);i = 1;）
         * 这还是值引用，所以改变不了。*/

    }
}
