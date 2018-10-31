package teststh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/4 0004 15:51
 */
public class TestList extends ArrayList implements List {
    public static void main(String[] args) {
        TestList testList = new TestList();
        testList.add(21);
        testList.add(21);
        testList.add(21);
        testList.add(21);
        testList.add(21);
        testList.add(21);
        int aa = testList.size();
        for (int i = 0; i < aa; i++) {
            System.out.println(testList.get(i));


        }

    }
}
