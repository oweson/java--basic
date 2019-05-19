package basic.river.extendsuperthisabstract.demo11;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void normalMethod() {
        // 首先调用父类的方法！
        super.normalMethod();
        System.out.println("你是对的！");
    }


}
