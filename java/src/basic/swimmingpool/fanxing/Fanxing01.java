package basic.swimmingpool.fanxing;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月30日 下午8:36:03 类说明：侵权必究。。。。。。。
 */

public class Fanxing01<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Fanxing01(T key) {
        super();
        this.key = key;
    }

    public Fanxing01() {
        super();
    }

    public T get(T... args) {
        return key;

    }

    @Override
    public String toString() {
        return "Fanxing [key=" + key + "]";
    }

    public static void main(String[] args) {
        Fanxing01<Integer> fanxing = new Fanxing01<>(100);
        Fanxing01<String> fanxing1 = new Fanxing01<>("100");
        Fanxing01<Long> fanxing2 = new Fanxing01<>(100l);
        System.out.println(fanxing);
        System.out.println(fanxing1);
        System.out.println(fanxing2);


    }

}
