package github.some.basic.my.StaticSingleClasss;


import github.some.basic.my.designdodel.StaticSingleClasss;

public class TestStaticClass {
    public static void main(String[] args) {
        StaticSingleClasss a = StaticSingleClasss.getsInstance();
        StaticSingleClasss aa = StaticSingleClasss.getsInstance();
        System.out.println(a == aa);
    }

}
