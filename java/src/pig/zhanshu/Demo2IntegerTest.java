package pig.zhanshu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/11 7:01
 */
public class Demo2IntegerTest {
    public static void main(String[] args) {
        Integer firsr = new Integer(3);
        Integer second=3;
        int three=3;
        System.out.println(firsr==second);
        System.out.println(firsr==three);
        // false 和true  int和Integer比较自动的拆箱
        Integer a = new Integer(3);
        Integer b = 3;
        Integer c=3;
        System.out.println(a==b);
        // false
        // a == b分析 
        //Integer b = 3; 自动调用Integer.valueOf(3) 返回一个Integer的对象。
        // 这个对象存放到cache中的（上面一段代码分析）。 而 Integer a = new Integer(3);
        // 这里创建了一个新的对象Integer 所以 a == b 返回的是false
        System.out.println(b==c);
        // true

    }
}
