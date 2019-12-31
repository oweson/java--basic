package basic.swimmingpool.generics;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月30日 下午9:45:29 类说明：侵权必究。。。。。。。
 */

public class Fanxing02<T> {
    private T key;
    private T value;

    public Fanxing02(T key, T value) {
        super();
        this.key = key;
        this.value = value;
    }

    public Fanxing02() {
        super();
    }

    /**
     * 第一：声明自定义的泛型
     * 第二：返回值的类型；
     * 第三：数据类型变量
     */
    public static <T> Fanxing02<T> get(T t) {
        System.out.println(t.toString());
        System.out.println(t);
        return new Fanxing02<>();

    }

    public <T> String Getas() {
        return toString();
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Fanxing02<Integer> asa = new Fanxing02<>(100, 100);
        Fanxing02<String> fanxing02 = new Fanxing02<String>("hello", "world");
        System.out.println(asa.getKey() + "  " + asa.getValue());
        System.out.println(fanxing02.getKey() + " " + fanxing02.getValue());
        Fanxing02<Integer> integerFanxing02 = get(210000);
        System.out.println(integerFanxing02.key);

    }


}
