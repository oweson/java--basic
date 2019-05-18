package basic.extendsuperthisabstract.demo12;

public class Zi extends Fu {

    public Zi() {
        // super写不写都是会默认调用无参构造器的，除非显示的调用有参构造；
        // super();
        super(10000);
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
