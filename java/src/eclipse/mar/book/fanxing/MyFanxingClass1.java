package eclipse.mar.book.fanxing;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:40:30 类说明：侵权必究。。。。。。。
 */

public class MyFanxingClass1<T> {
    private T aT;

    public MyFanxingClass1(T aT) {
        super();
        this.aT = aT;
    }

    public MyFanxingClass1() {
        super();
        // TODO Auto-generated constructor stub
    }

    public T getaT() {
        return aT;
    }

    public void setaT(T aT) {
        this.aT = aT;
    }

    public static void main(String[] args) {
        MyFanxingClass1<Integer> myFanxingClass = new MyFanxingClass1<>();
        myFanxingClass.setaT(21);
        System.out.println(myFanxingClass.getaT());

        MyFanxingClass1<String> myFanxingClass2 = new MyFanxingClass1<>();
        myFanxingClass2.setaT("大冬瓜");
        System.out.println(myFanxingClass2.getaT());
    }

}
