package basic.pond.basic.other;

public class Demo1Impl implements Demo1 {
    @Override
    public int add() {
        // A是接口的变量；
        System.out.println(A);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Demo1Impl().add());

    }

}
