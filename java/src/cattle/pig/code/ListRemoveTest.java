package cattle.pig.code;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/14 0014 15:54
 */
public class ListRemoveTest {
    public static void main(String[] args) {
        List<Integer> NumberList = new ArrayList<Integer>();
        NumberList.add(2);
        NumberList.add(4);
        NumberList.add(1);
        NumberList.add(3);
        NumberList.add(5);
        for (int i = 0; i < NumberList.size(); ++i) {
            int v = NumberList.get(i);
            if (v % 2 == 0) {
                NumberList.remove(v);
            }
        }
        System.out.println(NumberList);
    }
}
