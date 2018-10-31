package github.some.basic.my.testprogramSpeed;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            list.add("21");
        }
        System.out.println(list.size());
        // int length=0;
        long start = System.currentTimeMillis();
        // long start = currentTimeMillis;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("a");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        // 老方法用了848毫秒
        //新方法用了740
        // TODO Auto-generated method stub

    }

}
