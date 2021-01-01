package basic.pond.basic.samplestaticmodel;


public class TestFactory {
    public static void main(String[] args) {
        Cheng wanli = Factory.demo1();
        wanli.setAge(21);
        wanli.setLooklike("handsome");
        wanli.setName("oweson");
        System.out.println(wanli);
        Cheng wanli2 = wanli;
        System.out.println(wanli == wanli2);
        System.out.println(wanli.equals(wanli2));
    }


}


