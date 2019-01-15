package cattle.pig.article.english;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:24
 */
public class YuanMa {
    /** 1 What results from the following code fragment?
     int i = 5;
     int j = 10;
     System.out.println(i + ~j);

     正确答案: C   你的答案: A
     Compilation error because”~”doesn’t operate on integers
     -5
     -6
     15

     解析：
     10原码：0000000000000000,0000000000001010；
     ~10： 1111111111111111,1111111111110101  变为负数，计算机用补码存储
     ~10反码：10000000000000000,0000000000001010
     ~10补码：10000000000000000,0000000000001011，等于 -11
     故程序结果-6

     公式-n=~n+1可推出~n=-n-1，所以~10=-11再加5结果为-6
     */


}
