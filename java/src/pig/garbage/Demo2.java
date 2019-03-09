package pig.garbage;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/5 0005 17:40
 */
public class Demo2 {
    public static void main(String[] args) {
        boolean c = Character.isLetter('c');
        System.out.println(c);
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j>0 ; j--) {
                if(i==j){
                    continue;
                }
                System.out.println("i="+i+"j="+j);
                //i=0j=1

            }

        }
    }
}
