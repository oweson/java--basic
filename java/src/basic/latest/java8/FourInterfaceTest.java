package basic.latest.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/25 0025 20:58
 */
public class FourInterfaceTest {
    /**
     * consumer接口的测试
     */
    public void happy(Double d, Consumer<Double> c) {
        c.accept(d);

    }

    @Test
    public void testHappy() {
        happy(100.0, (d) -> System.out.print("asasaas" + d));
    }

    /**
     * 供给行接口
     */
    @Test
    public void testSupplier() {
        /**重要的demo*/
        /**生成随机数字的时候，math必须完毕后再用括号包括*/
        List<Integer> list = getList(15, () -> (int) (Math.random() * 100));
        for (Integer integer : list) {
            System.out.println(integer);

        }

    }

    public List<Integer> getList(int num, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList();

        for (int i = 0; i < num; i++) {
            /**返回Integer*/
            Integer integer = sup.get();
            list.add(integer);


        }
        return list;
    }
    /**函数式接口的应用*/
    public String funString(String str, Function<String,String> fun){
        /**注意apply核心的方法*/
        return fun.apply(str);
    }
    @Test
    public void testFunInterface(){
        String s = funString("   asa    sas book", (str) -> str.trim().toUpperCase());
        System.out.println(s);
        String s1 = funString("hello,world", (ppx) -> ppx.trim().substring(2));
        System.out.println(s1);
    }

    public static void main(String[] args) {

    }
}
