package eclipse.mar.book;

import java.lang.reflect.Modifier;

public enum Position {

    HERE, THERRE;

    public static void main(String[] args) {
        Class<Position> a = Position.class;
        a.getModifiers();
        String aa = Modifier.toString(a.getModifiers());
        System.out.println(aa);
    }

}
