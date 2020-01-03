package basic.river.extendsuperthisabstract.demo04;

public class Zi extends Fu {

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    @Override
    public void method() {
        System.out.println("子类重名方法执行！");
    }

    @Override
    public void methodFu() {
        System.out.println("hi!");
        // 调用父类的方法！！！
        super.methodFu();
        System.out.println("hi!");

    }
}
