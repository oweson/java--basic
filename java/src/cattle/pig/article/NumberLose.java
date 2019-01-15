package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:22
 */
public class NumberLose {
    /** 1 以下会产生信息丢失的类型转换是( ）

     正确答案: B   你的答案: B
     float  a=10
     int a=（int）8846.0
     byte  a=10； int b=-a
     double d=100;

     解析：会产生信息丢失不如说丢失精度，这样可能更容易明白，
     而精度丢失只会发生在从大范围到小范围的转换
     上面四个选项，只有 B 是从 double 到 int ，也就是从大范围到小范围。*/
}
