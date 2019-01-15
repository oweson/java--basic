package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:53
 */
public class StringTest {
    /** 1 Java语言中，如果"xyz"没有被创建过，String s =new String(“xyz”);创建了几个string object？;
     *
     * 两个。第一个在堆中，第二个在字符串常量池中！如果在Java字符串常量池中已经存在，就只会创建一个;
     * 对于这句代码，可分为两个过程：
     *
     * jvm 首先在字符串常量池内里面看看找不找到字符串"xyz"；找到，进入第二步；否则，创建新的 String 对象，并“放到”字符串常量池里面。
     * 然后由于遇到了 new，还会在堆创建 String 对象，其实是拷贝的常量池的那个，拷贝比创建大概快吧...最后将其返回给 s1。
     * 将 new String("xyz") 拆分为 new String() 和 "xyz"
     * 如果写在类方法里，请参考前面的类加载，就是相比之下提前驻留了吧。*/

    /** 2  java中 String str = &quot;hello world&quot;下列语句错误的是？
     java中 String str = "hello world"下列语句错误的是？
     正确答案: A B C   你的答案: A B C
     str+='      a'
     int strlen = str.length
     str=100
     str=str+100
     解析：str += 'a'   和 str +="a"都是对的，
     但是如果a前面加一个空格，那么只能用双引号了。代表字符串

     A. 'a'是字符,' a'这个是空格和a，必须要用" a"才可以;
     B.String有length()方法
     C.int 无法直接转成String类型
     D.尾部添加字符串”100“*/


    /** 3 String str = new String(“abc”)，“abc”在内存中是怎么分配的？
     正确答案: A C   你的答案: A C
     堆
     栈
     字符串常量区
     寄存器

     解析：即是堆和字符串常量池中，当你new String("abc")时，
     其实会先在字符串常量区生成一个abc的对象，然后new String()时会在堆中分配空间，
     然后此时会把字符串常量区中abc复制一个给堆中的String，故abc应该在堆中和字符串常量区*/
    /** 4 String类不可变，指的是String对象内容不可变，因为'String对象存在常量池中，而String的引用是可以可变，
     * 可以为String引用赋予新的对象字符串。*/

}
