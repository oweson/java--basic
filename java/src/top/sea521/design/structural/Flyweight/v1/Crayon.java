package top.sea521.design.structural.Flyweight.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:25
 */
public class Crayon implements ICrayon {
    private String color;

    public Crayon(String color) {
        System.out.println("---新建【" + color + "】蜡笔" );
        this.color = color;
    }

    @Override
    public void draw(String place) {
        System.out.println("用" + this.color + "蜡笔画" + place);
    }
}
