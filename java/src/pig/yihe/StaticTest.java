package pig.yihe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 21:19
 */
public class StaticTest {
    public static void main(String[] args) {

    }
}
class HelloA{

    public HelloA(){
        System.out.println("HelloA");
    }
    static {
        System.out.println("static A");
    }
}
class HelloB extends  HelloA{
    public HelloB(){
        System.out.println("helloB");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
    /**
     * static A
     * static B
     * HelloA
     * helloB*/
}
