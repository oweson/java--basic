package eclipse.mar.book;

public class InnerTest {
    public void demo1() {
        System.out.println(1001);
    }

    public static void main(String[] args) {
        new InnerTest() {
            @Override
            public void demo1() {
                System.out.println(211);

            }

        }.demo1();


    }

}
