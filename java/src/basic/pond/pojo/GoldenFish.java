package basic.pond.pojo;

/**
 * @author chengwanli
 * @date 2020/10/11 12:25
 */


public class GoldenFish extends Fish {
    public  void say(String say){
        System.out.println(say);
    }
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
