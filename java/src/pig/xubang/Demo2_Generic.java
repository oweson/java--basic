package pig.xubang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author oweson
 * @date 2021/3/29 21:26
 */


public class Demo2_Generic {
    public static void main(String[] args) {
        List<? extends Collection> list = new ArrayList<Collection>();
        List<? extends Collection> list2 = new ArrayList<LinkedList>();


    }
}
