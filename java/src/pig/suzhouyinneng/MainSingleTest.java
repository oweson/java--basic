package pig.suzhouyinneng;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 17:54
 */
public class MainSingleTest {
    public static void main(String[] args) {
        System.out.println(Pig.getOnePig());
        System.out.println(Pig.getOnePig());
        Pig onePig = Pig.getOnePig();
        Pig onePig02 = Pig.getOnePig();
        System.out.println(onePig==onePig02);

    }
}
