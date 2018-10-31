package github.some.basic.my.javas;

public class Hero {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public Hero(String name) {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public Hero(String name, float hp) {
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);

        System.out.println(teemo.name);

    }

}
