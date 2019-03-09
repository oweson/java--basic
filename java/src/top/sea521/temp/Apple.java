package top.sea521.temp;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/7 0007 20:01
 */
public class Apple {
    private volatile static Apple apple;
    private Apple(){}
    public static Apple getApple(){
        if(apple==null){
            synchronized (Apple.class){
                if(apple==null){
                    apple=new Apple();
                }
            }
        }
        return apple;
    }

    public static void main(String[] args) {
        Apple apple = Apple.getApple();
        Apple apple02 = Apple.getApple();
        System.out.println(apple==apple02);
    }
}
