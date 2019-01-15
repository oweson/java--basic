package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 17:58
 */
class Base {
    /**
     * 在执行new Alpha()时，会先执行父类的构造方法，在执行相应的子类的构造方法，所以此处会打印Base，
     * 在执行new Base()时，
     * 会直接执行Base中无参构造器的代码，再输出Base，所以选B
     */
    Base() {
        System.out.print("Base");
    }
}

public class Alpha extends Base {
    public static void main(String[] args) {
        new Alpha();
        //调用父类无参的构造方法
        new Base();
    }
}
