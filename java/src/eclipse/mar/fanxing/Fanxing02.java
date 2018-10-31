package eclipse.mar.fanxing;

import java.io.ObjectInputStream.GetField;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月30日 下午9:45:29 类说明：侵权必究。。。。。。。
 */

public class Fanxing02<T> {
    private T key;
    private T value;

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

    public Fanxing02(T key, T value) {
        super();
        this.key = key;
        this.value = value;
    }

    public Fanxing02() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static <T> Fanxing02<T> get() {
        return new Fanxing02<>();

    }

    public <T> String Getas() {
        return toString();
    }

    public static void main(String[] args) {
        Fanxing02<Integer> asa = new Fanxing02<>(100, 100);
        Fanxing02<String> fanxing02 = new Fanxing02<String>("hello", "world");
        System.out.println(asa.getKey() + "  " + asa.getValue());
        System.out.println(fanxing02.getKey() + " " + fanxing02.getValue());

    }

//	public static <T> Fanxing02<T> get01(int a,String b) {
//		return new Fanxing02<>(100,9)
//
//	}
}
