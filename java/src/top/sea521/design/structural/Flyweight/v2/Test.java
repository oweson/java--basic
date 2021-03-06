package top.sea521.design.structural.Flyweight.v2;

/**
 * Created by geely
 */
public class Test {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
        // 不在范围里面，创建对象
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a == b));
        // true

        System.out.println("c==d:" + (c == d));
        // false
        Integer j = 1000;
        Integer k = 1000;
        System.out.println(j == k);
        // false
        Integer x = 100;
        Integer y = 100;
        System.out.println(x == y);
        // true

    }
}
