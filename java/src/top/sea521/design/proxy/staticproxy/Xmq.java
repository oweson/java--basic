package top.sea521.design.proxy.staticproxy;

public class Xmq {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Pjl p = new Pjl();
        Mp m = new Mp(p);
        m.dosomething();
        m.pao();

    }

}
