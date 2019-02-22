package pig.yihe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 20:48
 */
public class Animal {
    Animal() {
        int i = 100;
        System.out.println(i);
    }
}

class Pig extends Animal {
    static int i = 200;

    public static void main(String[] args) {
        Pig pig = new Pig();
        System.out.println(i);
        // 打印100 200;
    }
}
