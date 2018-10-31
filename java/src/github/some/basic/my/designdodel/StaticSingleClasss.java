package github.some.basic.my.designdodel;

public class StaticSingleClasss {
    public static final StaticSingleClasss HELLO = new StaticSingleClasss();

    private StaticSingleClasss() {
    }

    public static StaticSingleClasss getsInstance() {
        return StaticSingleClasss.HELLO;
    }

}
