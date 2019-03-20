package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 12:05
 */
public class FinallyTest {
    /** 1 在try的括号里面有return一个值，那在哪里执行finally里的代码？
     正确答案: B   你的答案: B
     A:不执行finally代码
    B: return前执行
    C: return后执行

     解析：我相信仔细看的话，每一本Java书都有讲过。
     “假设利用 return 语句从 try 语句块中退出。在方法返回前，
     finally子句的内容将被执行。如果 finally 子句中也有一个 return 语句，
     这个返回值将会覆盖原始的返回值。！！！

     二：1、不管有木有出现异常，finally块中代码都会执行；
     2、当try和catch中有return时，finally仍然会执行；
     3、finally是在return后面的表达式运算后执行的
     （此时并没有返回运算后的值，而是先把要返回的值保存起来，
     不管finally中的代码怎么样，返回的值都不会改变，仍然是之前保存的值），
     所以函数返回值是在finally执行前确定的；
     4、finally中最好不要包含return，否则程序会提前退出，
     返回值不是try或catch中保存的返回值。”*/


    /** 三：我的理解：
     1、首先执行到try里的return，但是有finally语句还要执行，
     于是先执行return后面的语句，例如（x++），把要返回的值保存到局部变量。
     2、执行finally语句的内容，其中有return语句，
     这时就会忽略try中的return，直接返回。*/
}
