package top.sea521.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/26 0026 21:31
 */
public class Gc {
    public static void main(String[] args) {
        Student s = new Student();
        s.setsJava(21);
        Integer integer = s.getsJava();
        System.out.println(integer);
        System.gc();
        Integer bb = s.getsJava();
        System.out.println(bb);
    }
}
