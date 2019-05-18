package basic.jihekuanjia;

import java.util.ArrayList;
import java.util.List;

interface a {
}

class cat implements a {
    int age = 100;

    public cat(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "cat [age=" + age + "]";
    }

}

class dog implements a {
    int age = 100;

    public dog(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog [age=" + age + "]";
    }

}

public class TestAddTwoOnly {

    public static void main(String[] args) {
        List<a> list = new ArrayList<>();
        list.add(new cat(21));
        list.add(new dog(22));
        System.out.println(list.toString());
        // list.add(90);
        // TODO Auto-generated method stub

    }

}
