package aboutstring;

public class Demo1 {
    public static final String MESSAGE = "taotao";

    public static void main(String[] args) {
        System.out.println();
        String aString = "tao" + "tao";
        System.out.println(MESSAGE == aString);
        // 因为字符串产量pond；
        String aa = "tao";
        String bb = "tao";
        System.out.println(MESSAGE == (aa + bb));
        System.out.println(MESSAGE == (aa + bb).intern());
        // intern()回在产量吃中查找没有在赋值，所以为true;
        // TODO Auto-generated method stub

    }

}
