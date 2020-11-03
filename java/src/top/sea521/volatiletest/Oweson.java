package top.sea521.volatiletest;

/**
 * @author oweson
 * @date 2020/11/3 20:59
 */


public class Oweson extends Thread {
    private volatile Boolean flag = false;

    public Boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }
        flag = true;
        System.out.println("flag=" + flag);
    }

    public static void main(String[] args) {
        Oweson oweson = new Oweson();
        oweson.start();
        for(;;){
            if(oweson.isFlag()){
                System.out.println("有点东西！");
            }
        }
    }
}
