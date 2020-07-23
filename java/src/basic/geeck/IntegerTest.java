package basic.geeck;

import basic.latest.StreamAndMethodReference.demo04.MethodReference.Printable;
import basic.river.interfaces.FunctionalInterface.demo02.Lambda.MessageBuilder;

import java.util.function.Supplier;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 180;
        Integer b = 190;
        System.out.println(a == b);
        // false
        Integer c = 120;
        Integer d = 120;
        System.out.println(c == d);
        // true
        Integer e = 200;
        int f = 200;
        System.out.println(e == f);
        // true
        Supplier<String> stringSupplier = String::new;
        System.out.println(stringSupplier.get());
        MessageBuilder messageBuilder = () -> "ok";
        System.out.println(messageBuilder.builderMessage().toString());

    }
}
