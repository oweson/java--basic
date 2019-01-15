package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 12:03
 */
public class WhitchIsTrue {
    /** 1 下面为true的是？
     Integer i = 42;
     Long l = 42l;
     Double d = 42.0;
     下面为true的是
     正确答案: G   你的答案: F
     (i == l)
     (i == d)
     (l == d)
     i.equals(d)
     d.equals(l)
     i.equals(l)
     l.equals(42L)
     解析：包装类的“==”运算在不遇到算术运算的情况下不会自动拆箱
     包装类的equals()方法不处理数据转型；


     二：1、基本型和基本型封装型进行“==”运算符的比较，基本型封装型将会自动拆箱变为基本型后再进行比较，因此Integer(0)会自动拆箱为int类型再进行比较，显然返回true；

     int a = 220;

     Integer b = 220;

     System.out.println(a==b);//true
     2、两个Integer类型进行“==”比较， 如果其值在-128至127  ，那么返回true，否则返回false, 这跟Integer.valueOf()的缓冲对象有关，这里不进行赘述。

     Integer c=3;
     Integer h=3;
     Integer e=321;
     Integer f=321;
     System.out.println(c==h);//true
     System.out.println(e==f);//false
     3、两个基本型的封装型进行equals()比较，首先equals()会比较类型，如果类型相同，则继续比较值，如果值也相同，返回true。

     Integer a=1;
     Integer b=2;
     Integer c=3;
     System.out.println(c.equals(a+b));//true
     4、基本型封装类型调用equals(),但是参数是基本类型，这时候，先会进行自动装箱，基本型转换为其封装类型，再进行3中的比较。

     int i=1;
     int j = 2;
     Integer c=3;
     System.out.println(c.equals(i+j));//true

     发表于 2017-02-13 10:25:44 回复(7)
     206

     StrongYoung头像StrongYoung
     ABC3 个选项很明显，不同类型引用的 == 比较，会出现编译错误，不能比较。

     DEF 调用 equals 方法，因为此方法先是比较类型，而 i ， d ， l 是不同的类型，所以返回假。

     选项 G ，会自动装箱，将 42L 装箱成 Long 类型，所以调用 equals 方法时，类型相同，且值也相同，因此返回真。*/
}
