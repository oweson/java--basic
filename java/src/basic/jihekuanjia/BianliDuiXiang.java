package basic.jihekuanjia;

import java.util.ArrayList;
import java.util.List;

public class BianliDuiXiang {

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Students(21));
        }
        // 用挣钱for循环；
        for (Students s : list) {
            System.out.println(s);
        }

        /*
         * for (int i = 0; i < list.size(); i++) { Students s = list.get(i);
         * System.out.println(s);
         *
         * }
         */
        // TODO Auto-generated method stub

    }

}

class Students {
    int age = 100;

    @Override
    public String toString() {
        return "Student [age=" + age + "]";
    }

    public Students(int age) {
        // super();
        this.age = age;
    }

}
