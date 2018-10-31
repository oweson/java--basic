package chapter03;

import java.util.Comparator;

public class UserSet2 implements Comparator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Override
    public int compare(Object o, Object o0) {
        int x = 0;
        Student s1 = (Student) o;
        Student s2 = (Student) o0;
        if (s1.getAge() > s2.getAge()) {
            return -1;

        } else if (s1.getAge() < s2.getAge()) {
            return 1;

        } else {
            x = s1.getSno().compareTo(s2.getSno());
            return x;

        }
        //自定义比较器，相比较年龄然后比较学号；

        // TODO Auto-generated method stub
        //return x;
    }

}
