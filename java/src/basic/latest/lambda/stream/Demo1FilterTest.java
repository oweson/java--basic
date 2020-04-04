package basic.latest.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1FilterTest {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        List<Integer> collect = integerList.stream().filter(integer -> integer == 1).collect(Collectors.toList());
        System.out.println(collect);

    }
}
