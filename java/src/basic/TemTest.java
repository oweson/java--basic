package basic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/20 0020 21:59
 */
public class TemTest {
    int ppx=100;
    public static void demo1(){
        System.out.println(new TemTest().ppx);
        new TemTest().demo2();



    }
    public void demo2(){

    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        demo1();
        int ppx=100;
        int[] a={};
        Integer[] a1={};
        List<String> list = new ArrayList<>();
        ArrayList<Integer> list02 = new ArrayList<Integer>();
        Object invoke = list02.getClass().getMethod("add", Object.class).invoke(list, "abc");
        System.out.println(list02.isEmpty());
        System.out.println(invoke);
    }
}
