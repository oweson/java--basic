package basic.pond.basic.other;

import java.lang.reflect.Modifier;

public enum Position {

    HERE, THERRE;

    public static void main(String[] args) {
        /**得到修饰符*/
        Class<Position> a = Position.class;
        a.getModifiers();
        String aa = Modifier.toString(a.getModifiers());
        System.out.println(aa);
    }

}
