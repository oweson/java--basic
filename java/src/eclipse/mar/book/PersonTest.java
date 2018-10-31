package eclipse.mar.book;

public class PersonTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = Integer.parseInt("100");
        System.out.println(a + 100);
        PersonTest p = new PersonTest();
        PersionDemo pd = new PersionDemo();
        pd.method(new Person() {

            @Override
            public void show() {
                System.out.println("ffffffffffffffff");
                // TODO Auto-generated method stub

            }
        });

        // p.
        // TODO Auto-generated method stub

    }

}

abstract class Person {
    public abstract void show();
}

class PersionDemo {
    public void method(Person p) {
        p.show();
        System.out.println("persiondemo");
    }
}
