package basic.geeck;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100.21");
        long longValueExact = bigDecimal.longValueExact();
    }
}
