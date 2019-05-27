package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/2 0002 9:10
 */
public class Fish {
    private Fish(){}
    private volatile static Fish fish=null;
    public static Fish getFish(){
        if(fish==null){
            synchronized (Fish.class){
                if(fish==null){
                    fish=new Fish();
                }
            }
        }
        return fish;
    }

    public static void main(String[] args) {
        Fish fish = Fish.getFish();
        Fish fish02 = Fish.getFish();
        System.out.println(fish==fish02);
    }
}
