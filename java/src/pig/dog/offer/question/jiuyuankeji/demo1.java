package pig.dog.offer.question.jiuyuankeji;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/17 19:14
 */
public class demo1 {
    public static void demo1() {
        Map<String, Integer> map = new HashMap();
        map.put("test", Integer.valueOf("123"));
        /*String test = (String) map.get("test");
        System.out.println(test);*/
        // 异常！！！
    }

    public static void demo2() {
        int i = 12;
        System.out.println(i += i -= i *= i);
        // -120    没有括弧，144,12-144=-132,12+(-132)=-120;
        //先乘除，
        //后加减，
        //自右向左计算。
    }

    public static void demo3() {
        /** 1 个Java程序运行从上到下的环境次序是?
         * 先执行程序，然后到JVM中编译运行，然后到操作系统，最好才能操作硬件!!!*/
        /** 2 配置过滤器的标签是？
         * <!-- 定义Filter -->
         * <filter>
         * <!-- Filter的名字 -->
         * <filter-name>log</filter-name>
         * <!-- Filter的实现类 -->
         * <filter-class>lee.LogFilter</filter-class>
         * </filter>
         * <!-- 定义Filter拦截的URL地址 -->
         * <filter-mapping>
         * <!-- Filter的名字 -->
         * <filter-name>log</filter-name>
         * <!-- Filter负责拦截的URL 全部以/的请求,如果<url-pattern>/*.action </>,将会以拦截*.action的请求-->
         * <url-pattern>/*</url-pattern>
         * </filter-mapping>*/
    }

    public static void demo4() {
        /** 以下关于对象序列化描述正确的是(CD)
         使用FileOutputStream可以将对象进行传输
         使用PrintWriter可以将对象进行传输
         使用transient修饰的变量不会被序列化
         对象序列化的所属类需要实现Serializable接口?

         1 能够对对象进行传输的貌似只有ObjectOutputStream和ObjectInputStream这些以Object开头的流对象。
         2 继承Seriallizable接口是经常见到的
         3 transient 修饰的变量在对象串化的时侯并不会将所赋值的值保存到传中，串化的对象从磁盘读取出来仍然是null。
         4、这值得说下Volatile这个修饰符，它是针对多线程情况下出现的。当线程读取它修饰的变量时，都会强迫从主存中重新读取。

         */

    }
    public  static  void demo5(){
        /**  var x=10;
         var y=10;
         alert("x+y is"+x+y);
         // 1010 字符串！！！*/
        // todo 理解考官的意图，要是20没啥意思？？？靠你10+10吗？？？有不是小学生！！！

        // 2 获得某一天
       /* var date = Date.getDate();
        alert(date);*/
    }

    public static void main(String[] args) {
        System.out.println();
        demo2();
        class A {
            public int i = 3;
        }
        Object o = new A();
        A a = (A) o;
        System.out.println("i =" + a.i);
        // 3;
    }
}
