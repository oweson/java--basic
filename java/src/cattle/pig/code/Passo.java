package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 16:41
 */
class Two{
    Byte x;
    //x=null;
}
 public class Passo{
    public static void main(String[] args){
        Passo p=new Passo();
        p.start();
    }
    void start(){
        /**解析：该题中引用类型t作为形参进行传递，形参的改变会改变实参的值，
         * 所以再次打印t.x时已经变为42了。*/
        Two t=new Two();
        System.out.print(t.x+"");
        //null
        Two t2=fix(t);
        System.out.print(t.x+"" +t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}
