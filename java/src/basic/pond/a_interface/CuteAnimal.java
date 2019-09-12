package basic.pond.a_interface;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/12 19:57
 */
public class CuteAnimal extends LandAnimal implements CuteFeature {
    @Override
    public void special() {
        System.out.println("i,m special!");
    }

    @Override
    public void sing() {
        System.out.println("sing!");

    }

    public static void main(String[] args) {
        CuteFeature cuteFeature = new CuteAnimal();

        cuteFeature.sleep();
    }
}
