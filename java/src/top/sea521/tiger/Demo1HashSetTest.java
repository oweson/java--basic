package top.sea521.tiger;

import java.util.HashSet;
import java.util.Set;

public class Demo1HashSetTest {
    public static void main(String[] args) {
        // 1 初始化集合的容量可以指定，加载因子默认是0.75，也可以自定义
        Set set = new HashSet<>(1024,2);
    }
}
