package eclipse.mar.duixiang;

public class Demo1 {
    int age;
    String name;

    // new Demo1().age=210;
    // new Demo1();

    /**
     * @param args
     */
    public static void main(String[] args) {
        Demo1 a = new Demo1();
        // new Demo1().age=210;
        // 没有意义；

        haha(a);
        dayin(a);
        // TODO Auto-generated method stub

    }

    private static void dayin(Demo1 a) {
        System.out.println(a.age + "\t" + a.name);
        // TODO Auto-generated method stub

    }

    private static void haha(Demo1 a) {
        a.age = 210;
        a.name = "oweson";
        // TODO Auto-generated method stub

    }

}
