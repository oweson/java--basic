package pig.Unicom;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/4 14:59
 */
public class MainTest extends  Animal {
   public MainTest(){
       super();

   }
   public MainTest(Bird bird){
       this();
       bird = new Bird();

   }
    public static void main(String[] args) {
        Bird bird = new Bird();
        MainTest mainTest = new MainTest();
        MainTest mainTest1 = new MainTest(bird);


    }

}
