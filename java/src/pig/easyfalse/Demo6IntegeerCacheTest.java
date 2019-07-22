package pig.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/29 0029 7:40
 */
public class Demo6IntegeerCacheTest {
    public static void main(String[] args) {
        /** 1 -127-128会缓存对象*/
        Integer integer = Integer.valueOf(21);
        Integer integer01 = Integer.valueOf(21);
        /** 2 得到同一个对象的引用*/
        System.out.println(integer == integer01);
        // true
        /**Integet.valueOf();int转化为Integer*/
        Integer a = new Integer(123);
        Integer b = new Integer(123);
        System.out.println(a == b);
        // false
        System.out.println(a.equals(b));
        //true
    }
}
