package basic.lake.collection;

import java.util.*;

public class UUIDtest {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        Set<String> list = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(UUID.randomUUID().toString());

        }
        System.out.println(list.size());
        System.out.println(System.currentTimeMillis() - begin);
    }
}
