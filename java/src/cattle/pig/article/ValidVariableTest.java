package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 18:07
 */
public class ValidVariableTest {
    /** 1 a>1;
     i++;
     B项，中间变量缓存机制。
     等同于
     1
     2
     3
     temp = i;
     i=i+1;
     i=temp;
     a= a+1=5;
     y = int ( i );
     --------------------------------------------------

     y为short、byte、char时，
     1
     y = （int）i; //发生向下转型，不可赋值

     B是合法的！！！
     */
}
