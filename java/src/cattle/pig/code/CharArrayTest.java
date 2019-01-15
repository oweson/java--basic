package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 18:13
 */
public class CharArrayTest {
    /**副本与原数据是不相关的，不会相互影响的。不过一般方法传递时候，
     * 只有基本数据类型和String才会传递副本，其他的类型是按引用的传递的。JamesNiu
     * java 中String是 immutable的，也就是不可变，一旦初始化，其引用指向的内容是不可变的。
     *
     * 也就是说，String str = “aa”；str=“bb”；第二句不是改变“aa”所存储地址的内容，而是另外开辟了一个空间用来存储“bb”；同时由str指向
     *
     * 原来的“aa”，现在已经不可达，GC时会自动回收。
     *
     * 因此String作为参数传进来时候，str= "test ok"; 实际给副本引用str指向了新分配的地址，该地址存储“test ok”。
     *
     * 因此，原先的str仍然指向“good”;
     *
     * */
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        CharArrayTest ex = new CharArrayTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str +"and");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]){
        str= "test ok";
        ch[0]= 'g';
    }
}
