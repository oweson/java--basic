package basic.extendsuperthisabstract.demo12;

public abstract class Fu {
    protected int a;

    public Fu() {
        System.out.println("抽象父类构造方法执行！");
    }
    public  Fu(Integer integer){
        //调用构造器初始化a的值；
        a=570347720;
        System.out.println(integer+"is:");
    }

    public abstract void eat();

}
