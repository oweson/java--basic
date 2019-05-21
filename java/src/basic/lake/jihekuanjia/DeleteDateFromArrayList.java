package basic.lake.jihekuanjia;

import java.util.ArrayList;
import java.util.List;

class Bird {

    String name;

    public Bird(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird [name=" + name + "]";
    }

    ;

}

public class DeleteDateFromArrayList {

    public static void main(String[] args) {
        int count = 0;
        List<Bird> list = new ArrayList<Bird>();
        for (int i = 1; i <= 100; i++) {
            count++;
            list.add(new Bird("hero" + i));
        }
        // 创建临时容器
        List<Bird> tem = new ArrayList<>();
        for (Bird b : list) {
            String s = b.name.substring(4);
            int i = Integer.parseInt(s);
            if (0 == i % 8) {
                tem.add(b);
            }

            // System.out.println(bird);
        }
        for (Bird c : tem) {
            list.remove(c);

        }
        System.err.println(list.size());
        System.out.println(list.size());


    }

}
