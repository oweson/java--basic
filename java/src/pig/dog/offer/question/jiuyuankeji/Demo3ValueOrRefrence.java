package pig.dog.offer.question.jiuyuankeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/18 20:57
 */
public class Demo3ValueOrRefrence {
    public static void swap(int a, int b) {
        int x = a;
        a = b;
        b = x;
        System.out.println("swap a: " + a);
        System.out.println("swap b: " + b);
    }
    public static void main(String[] args) {
        // 认为 Java 中是有引用传递的，其实不然;
        int a = 3;
        int b = 4;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

