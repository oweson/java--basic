package top.sea521.temp;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/7 0007 20:03
 */
public class Banana {
    private static Banana banana = new Banana();
    private Banana(){}
    public static Banana getBanana(){
        return banana;
    }

    public static void main(String[] args) {
        Banana banana = Banana.getBanana();
        Banana banana02 = Banana.getBanana();
        System.out.println(banana==banana02);
    }
}
