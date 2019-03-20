package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:45
 */
public class InterfaceTest {
    /** 1 以下哪个接口的定义是正确的？（ ）

     正确答案: D   你的答案: D
     A:interface  B
     { public abstract void print()  {  } ;}
     B:interface  B
     { static void print() ;}
     C:abstract  interface  B  extends  A1, A2
     //A1、A2为已定义的接口
     {private abstract  void  print();}
     D:interface  B
     {  void  print();}

     解析：
     A 抽象方法不能有方法体，仔细点可以看到有大括号。
     B 接口里的方法只能用 public 和 abstract 修饰，
     如果你不写也没关系，默认的也是 public abstract 修饰.
     C 同上
     D 正确*/
}
