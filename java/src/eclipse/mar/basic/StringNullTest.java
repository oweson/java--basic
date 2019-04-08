package eclipse.mar.basic;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/13 0013 16:44
 */
public class StringNullTest {
    public static Integer demo1() {
        return null;
    }

    public static void main(String[] args) {
        Integer integer = demo1();
        System.out.println(integer);
        String s = null;
        // System.out.println(s.length());
        /** 1 空指针异常*/
        System.out.println(s == null);
        /** 2 null可以和null进行比较*/
        if (s != null && s.length() == 0) {
            /**具有短路的效果，左边为异常，右边就不会运行*/
            System.out.println(100);
        }
        /* if(s!=null & s.length()==0){
         *及时左边的不成立，右边的还是会运行
         * null的对象不可以调用方法和nullpointexception*//*
        }*
        * if(s!=null | s.length()==0){
         *//**空指针异常*//*


        }*/
        if (s == null || s.length() == 0) {
            /**左边运行满足，右面直接越过返回true
             * ||任意一个满足都会运行的，
             * |必须两个都得满足才可以
             * */
            System.out.println("ppx");
        }
    }
}
