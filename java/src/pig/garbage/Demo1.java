package pig.garbage;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/5 0005 17:33
 */
public class Demo1 {
    public static void main(String[] args) {
        int x=10;
        x+=x-=x-x;
        System.out.println(x);
        System.out.println("===============================================");
        int c=3;
        int y=(c++)+(++c)+(c++);
        //c++=3 ++c=
        System.out.println(y);//y=13;

    }
}
