package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:12:48 类说明：侵权必究。。。。。。。
 */

public enum Demo3EnumCar {
    lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;

    Demo3EnumCar(int p) {
        this.price = p;
        // TODO Auto-generated constructor stub
    }

    /*
     * Car(int p) { price = p; }
     */
    int getPrice() {
        return price;
    }

}
