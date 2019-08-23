package basic.cloudcode;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/22 20:37
 */
public class ListTest {
    public static final void demo1(){
        List<Animal> list = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat(i,"ppx");
            cats.add(cat);

        }
        Animal animal = new Animal();
        animal.setCatList(cats);
        //cats.clear();
        System.out.println(animal.getCatList().size());
    }
    public static void main(String[] args) {
        String cell="mark";
        demo1();
        if (cell != null && cell.equals("mark")) {
            System.out.println("mark");
            // 设备

        } else {

        }

    }
}
