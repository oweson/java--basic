package basic.lake;

import java.util.ArrayList;
import java.util.List;

public class Demo1ListsTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);

        }
        // 删除第一个元素
        integerList.remove(0);
        System.out.println(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            integerList.remove(i);

        }
        System.out.println(integerList);
    }
}
