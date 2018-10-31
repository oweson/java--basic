package eclipse.mar.fanxing;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月30日 下午8:36:03 类说明：侵权必究。。。。。。。
 */

public class Fanxing<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Fanxing(T key) {
        super();
        this.key = key;
    }

    public Fanxing() {
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
        Fanxing<Integer> fanxing = new Fanxing<>(100);
        Fanxing<String> fanxing1 = new Fanxing<>("100");
        Fanxing<Long> fanxing2 = new Fanxing<>(100l);
        System.out.println(fanxing);
        System.out.println(fanxing1);
        System.out.println(fanxing2);
        Object object = new Fanxing<>().get(10, 100);
        System.out.println(object);

    }

}
