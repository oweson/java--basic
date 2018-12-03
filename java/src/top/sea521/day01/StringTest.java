package top.sea521.day01;

public class StringTest {
    public static final String MESSAGE = "taotao";

    public static void main(String[] args) {
        String aString = "tao" + "tao";
        System.out.println(MESSAGE == aString);
        // 因为字符串产量pond；
        //todo 重点
        String aa = "tao";
        String bb = "tao";
        System.out.println(MESSAGE == (aa + bb));
        System.out.println(MESSAGE == (aa + bb).intern());
        // intern()回在产量吃中查找没有在赋值，所以为true;
        // TODO Auto-generated method stub

    }

}
