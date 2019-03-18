package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/17 0017 19:52
 */
public class Pig {
    private static volatile Pig pig = null;

    private Pig() {
    }

    public static Pig getPig() {
        if (pig == null) {
            synchronized (Pig.class) {
                if (pig == null) {
                    pig = new Pig();
                }
            }
        }
        return pig;
    }

    public static void main(String[] args) {
        Pig pig = getPig();
        Pig pig02 = getPig();
        System.out.println(pig == pig02);
    }
}
