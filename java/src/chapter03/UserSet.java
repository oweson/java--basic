package chapter03;

import java.util.Comparator;

public class UserSet implements Comparator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Override
    public int compare(Object obj, Object obj2) {
        int x = 0;
        x = obj.toString().compareTo(obj2.toString());
        ;
        // TODO Auto-generated method stub
        return x;
        // 自定义的比较器；

    }

}
