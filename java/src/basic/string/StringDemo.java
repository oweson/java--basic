package basic.string;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/27 0027 10:05
 */
public class StringDemo {
    private static final String MESSAGE = "taobao";

    public static void main(String[] args) {
        /**  1 要注意两个问题：
         1，字符串在java中存储在字符串常量区中
         2，==判断的是对象引用是否是同一个引用，判断字符串相等要用equals方法
         首先判断a==MESSAGE 同一份字符串常量在内存中只有一份，因此是同一地址，返回true
         再次比较(b+c)==MESSAGE 这相当于 new String(b+c)==MESSAGE 这里new了一个String对象，所以返回false
         */

        /** 2 这题是在考编译器的优化，hotspot中 编译时"tao"+"bao"将直接变成"taobao"，b+c则不会优化，因为不知道在之前的步骤中bc会不会发生改变，
         * 而针对b+c则是用语法糖，新建一个StringBuilder来处理*/
        /**  3 */
        String a = "tao" + "bao";
        String b = "tao";
        String c = "bao";
        System.out.println(a == MESSAGE);
        System.out.println((b + c) == MESSAGE);
    }
}
