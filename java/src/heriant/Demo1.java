package heriant;

public class Demo1 {
    Demo1(String s) {
        System.out.println("aaaaaaaaaaaaaaaaaa");
    }

    public static void main(String[] args) {
        System.out.println(new Demo1OfSon("as"));
        // TODO Auto-generated method stub

    }

}

class Demo1OfSon extends Demo1 {

    Demo1OfSon(String s) {
        super(s);
        System.out.println("bbbbbbbbbbbbbb");
        // TODO Auto-generated constructor stub
    }


}
