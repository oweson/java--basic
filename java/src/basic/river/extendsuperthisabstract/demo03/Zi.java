package basic.river.extendsuperthisabstract.demo03;

public class Zi extends Fu {

    int num = 20;
    int age = 24;

    public void method() {
        int num = 30;
        System.out.println(num);
        // 30，局部变量
        System.out.println(this.num);
        // 20，本类的成员变量
        System.out.println(super.num);
        // 10，父类的成员变量
        System.out.println(age);
        // 成员变量在普通的方法里面可以直接使用

    }

    public static void main(String[] args) {
        //System.out.println(this.age);静态方法里面不能使用this;

    }

}
