package eclipse.mar.book;

public class InnerTest {
    public void demo1() {
        System.out.println(1001);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new InnerTest() {
            @Override
            public void demo1() {
                System.out.println(211);
                // TODO Auto-generated method stub
                //super.demo1();
            }

        }.demo1();
        // this is called inner use
        // System.out.println(100);
        // TODO Auto-generated method stub

    }

}
