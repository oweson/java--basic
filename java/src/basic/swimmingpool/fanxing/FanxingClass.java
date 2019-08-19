package basic.swimmingpool.fanxing;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午10:23:36 类说明：侵权必究。。。。。。。
 */

public class FanxingClass<T> {
    private T aT;
    private T bT;

    public FanxingClass(T aT, T bT) {
        super();
        this.aT = aT;
        this.bT = bT;
    }

    public FanxingClass() {
        super();
    }

    public T getaT() {
        return aT;
    }

    public void setaT(T aT) {
        this.aT = aT;
    }

    public T getbT() {
        return bT;
    }

    public void setbT(T bT) {
        this.bT = bT;
    }

    public static void main(String[] args) {
        /** 具有通用性 */
        FanxingClass<String> fanxingClass = new FanxingClass<>();
        FanxingClass<Integer> fanxingClass2 = new FanxingClass<>();
        fanxingClass2.setaT(21);
        System.out.println(fanxingClass2.getaT());

        fanxingClass.setaT("hello");
        System.out.println(fanxingClass.getaT());
        fanxingClass.getaT();


    }

}
