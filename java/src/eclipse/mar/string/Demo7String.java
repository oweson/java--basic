package eclipse.mar.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/22 0022 9:03
 */
public class Demo7String {
    public static void main(String[] args) {
        /** 1 int i = 5;

         //把一个基本类型的变量,转换为Integer对象
         Integer it = new Integer(i);
         //把一个Integer对象，转换为一个基本类型的int
         int i2 = it.intValue();*/
        int a=100;
        Integer integer = new Integer(a);
        int i = integer.intValue();
        System.out.println(i);
        /** 2 Number类 顶 折 纠 问
         数字封装类有
         Byte,Short,Integer,Long,Float,Double
         这些类都是抽象类Number的子类*/
        System.out.println(integer instanceof Number);
        /** 3  int i = 5;

         //基本类型转换成封装类型
         Integer it = new Integer(i);*/
        /** 4 int i = 5;

         //基本类型转换成封装类型
         Integer it = new Integer(i);

         //自动转换就叫装箱
         Integer it2 = i;*/
        /** 5    不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱*/
        /** 6 数字转字符串 顶 折 纠 问
         方法1： 使用String类的静态方法valueOf
         方法2： 先把基本类型装箱为对象，然后调用对象的toString*/
       /* int aa=100;
        String s = String.valueOf(aa);*/
       /* int i1 = Integer.parseInt("21000");
        Integer integer1 = Integer.valueOf(12);
        valueof方法*/
       /** 7 格式化输出 顶 折 纠 问
        如果不使用格式化输出，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
        使用格式化输出，就可以简洁明了

        %s 表示字符串
        %d 表示数字
        %n 表示换行*/
       /** 8 char对应的封装类是Character
        装箱拆箱概念，参考 拆箱装箱*/
      /*  System.out.println(Character.isDigit('9'));
        System.out.println(Character.isUpperCase('9'));
        countNumberAndUpcaseCharcter();*/
      /** 9 字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象
       常见创建字符串手段：
       1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
       2. 调用String的构造方法创建一个字符串对象
       3. 通过+加号进行字符串拼接也会创建新的字符串对象 */
      /** 10 String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

       String teemo = new String("提莫"); //创建了两个字符串对象

       char[] cs = new char[]{'崔','斯','特'};

       String hero = new String(cs);//  通过字符数组创建一个字符串对象

       String hero3 = garen + teemo;//  通过+加号进行字符串拼接;
       String 被修饰为final,所以是不能被继承的*/
      /** 11 immutable 顶 折 纠 问
       immutable 是指不可改变的
       比如创建了一个字符串对象
       String garen ="盖伦";
       不可改变的具体含义是指：
       不能增加长度
       不能减少长度
       不能插入字符
       不能删除字符
       不能修改字符
       一旦创建好这个字符串，里面的内容 永远 不能改变

       String 的表现就像是一个常量*/
      /** 12 length方法返回当前字符串的长度
       可以有长度为0的字符串,即空字符串*/
        System.out.println("pps".length());
        System.out.println("".length());
        System.out.println("  ".length());
        /** 12 内置的Arrays.sort排序方法*/
      /*  char[] chars = "abdcefa".toCharArray();
        Arrays.sort(chars);
        for (char aChar : chars) {
            System.out.println(aChar);

        }
*/
     /*   int o = "hello,hello".lastIndexOf("o");
        System.out.println(o);*/
     /**一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
      所以在第6行会创建了一个新的字符串"the light"
      但是在第7行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建*/
     /**什么StringBuffer可以变长？
      和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
      比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
      如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考MyStringBuffer
      length: “the”的长度 3
      capacity: 分配的总空间 19*/
     StringBuffer sb = new StringBuffer();
     sb.insert(0,"1212");
     sb.append(2);
        System.out.println(sb);

    }
    public static final void countNumberAndUpcaseCharcter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input............");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        List  list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]) || Character.isUpperCase(chars[i])){
                list.add(chars[i]);

            }


        }
        for (Object o : list) {
            System.out.println(o);

        }

    }
}
