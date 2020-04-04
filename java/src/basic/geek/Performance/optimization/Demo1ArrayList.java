package basic.geek.Performance.optimization;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo1ArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerParamList = new Vector<>();

        for (int i = 0; i < 1000000; i++) {
            integerList.add(i);

        }
        // 不安全,arrayList,vector可以
        integerList.stream().parallel().filter(i -> i % 2 == 1).forEach(integerParamList::add);
        System.out.println(integerList.size());
    }
}
