package pig.huoshikeji;

import java.util.ArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 19:01
 */
public class Fish03 {
    int a;

    public static void main(String[] args) {
        Fish03 fish03 = new Fish03();
        ArrayList<Fish03> list = new ArrayList();
        list.add(fish03);
        fish03.a = 3;
        Fish03 fishing = list.get(0);
        System.out.println(fishing.a);
        //3
        ArrayList<Fish03> newArrayList = list;
        fish03.a = 4;
        Fish03 fishLast = newArrayList.get(0);
        System.out.println(fishLast.a);
        // 4

    }
}
