package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:22
 */
public class StaticBlockTest {
    /**
     * 1 子类A继承父类B, A a = new A(); 则父类B构造函数、父类B静态代码块、父类B非静态代码块、
     * 子类A构造函数、子类A静态代码块、
     * 子类A非静态代码块 执行的先后顺序是？
     * <p>
     * answer:父类Ｂ静态代码块->子类Ａ静态代码块->父类Ｂ非静态代码块->父类Ｂ构造函数->子类Ａ非静态代码块->子类Ａ构造函数
     * <p>
     * 解析：当实例化子类对象时，首先要加载父类的class文件进内存，静态代码块是随着类的创建而执行，
     * 所以父类静态代码块最先被执行，子类class文件再被加载，同理静态代码块被先执行；
     * 实例化子类对象要先调用父类的构造方法
     * ，而调用父类构造方法前会先执行父类的非静态代码块
     */
    public static void main(String[] args) {

    }
}
