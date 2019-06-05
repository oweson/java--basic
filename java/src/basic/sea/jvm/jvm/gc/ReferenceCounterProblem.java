package basic.sea.jvm.jvm.gc;

public class ReferenceCounterProblem {
    public static void main(String[] args) {
        /**相互引用，无法回收！*/
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        object1.childNode = object2;
        object2.childNode = object1;

    }

}
