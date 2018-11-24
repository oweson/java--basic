package top.sea521.javase.demo01;

import javafx.scene.media.VideoTrack;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/19 0019 22:36
 */
public class Demo1Hello {
    public static void main(String[] args) {
        /**1 Eclipse是保存后自动编译，但是建立在一个设置的前提上：
         菜单-Project->勾选Build Automatically，如果这里没有勾选，
         那么是不会自动把Hello.java编译成Hello.class的*/
        /** 2 Java中有八种基本类型，都是Java语言预先定义好的，并且是关键字。

         这八种基本类型分别是：
         整型 （4种）
         字符型 （1种）
         浮点型 （2种）
         布尔型（1种）*/
        /** 3 给基本类型的变量赋值的方式叫做 字面值，如下所例：

         float hp = 313f;*/
        /** 4 精度高的数据类型就像容量大的杯子，可以放更大的数据
         精度低的数据类型就像容量小的杯子，只能放更小的数据
         小杯子往大杯子里倒东西，大杯子怎么都放得下
         大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出
         需要注意的一点是
         虽然short和char都是16位的，长度是一样的
         但是彼此之间，依然需要进行强制转换;l 是long类型的，其类型长度是64位
         i 是int类型的，其类型长度是32位
         所以l的精度，比i的精度要高
         l = i;
         把i的值赋给l， 首先l和i彼此的类型是不一样的，那么能否转换就取决于彼此的精度
         这个例子，是低精度向高精度转换 是可以正常转换的
         换句话说，int比较小，要放进比较大的long,随便怎么样，都放的进去*/
        /** 5 b的类型是byte,其长度是8，最大只能放127
         i1 的类型是int, 其长度是32,最大，反正就是很大了，超过127
         所以， 把int类型的数据转成为byte类型的数据，是有风险的
         有的时候是可以转换的，比如 b = i1 (i1=10);
         有的时候不可以转换 比如 b= i2 (i2=300) 因为放不下了
         编译器就会提示错误
         这个时候就只能采用强制转换，强制转换的意思就是，转是可以转的，但是不对转换之后的值负责。 风险自担，后果自负*/
        /** 6  char c = 'A';
         short s = 80;

         //虽然short和char都是16位的，长度是一样的
         //但是彼此之间，依然需要进行强制转换
         c = (char) s;
         //直接进行转换，会出现编译错误
         s = c;*/
        /** 7 当一个变量被声明在类下面
         变量就叫做字段 或者属性、成员变量、Field
         比如变量i,就是一个属性。
         那么从第2行这个变量声明的位置开始，整个类都可以访问得到
         所以其作用域就是从其声明的位置开始的整个类;
         如果一个变量，是声明在一个方法上的，就叫做参数
         参数的作用域即为该方法内的所有代码
         其他方法不能访问该参数
         类里面也不能访问该参数;
         声明在方法内的变量，叫做局部变量
         其作用域在声明开始的位置，到其所处于的块结束位置*/
        /** 8 final 修饰一个变量，有很多种说法，比如不能改变等等
         准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会*/
        /** 9 从{ 开始 到对应的} 结束，即一个块*/
        new Demo1Hello().demo1(1);

    }

    public void demo1(final int a) {
        /**形参待传入;
         * 在方法参数前面加final关键字就是为了防止数据在方法体中被修改。
         *
         * 主要分两种情况：第一，用final修饰基本数据类型；第二，用final修饰引用类型。
         *
         * 第一种情况，修饰基本类型（非引用类型）。这时参数的值在方法体内是不能被修改的，即不能被重新赋值。
         * 否则编译就通不过;
         * 第二种情况，修饰引用类型。这时参数变量所引用的对象是不能被改变的。作为引用的拷贝，
         * 参数在方法体里面不能再引用新的对象。否则编译通不过*/
        //a++;

        System.out.println(a);
    }
}

class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
