package eclipse.mar.samplestaticmodel;

import org.junit.Test;

public class TestFactory {
    //public static void main(String[] args) {
    @Test

    public void test() {
        Cheng wanli = Factory.demo1();
        wanli.demo1();
        wanli.setAge(21);
        wanli.setLooklike("handsome");
        wanli.setName("oweson");
        System.out.println(wanli.toString());
        System.out.println(wanli);
        Cheng wanli2 = wanli;

        System.out.println(wanli == wanli2);
        System.out.println(wanli.equals(wanli2));
        //ÿ�εĵ��ö������һ������;

    }


}

