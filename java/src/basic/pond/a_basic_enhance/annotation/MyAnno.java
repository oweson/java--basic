package basic.pond.a_basic_enhance.annotation;


public @interface MyAnno {

    int value();

    Person per();

    MyAnno2 anno2();

    String[] strs();
    /*String name() default "张三";*/
     /*String show2();

     Person per();
     MyAnno2 anno2();

     String[] strs();*/


}
