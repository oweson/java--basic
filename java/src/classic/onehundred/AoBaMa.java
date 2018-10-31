package classic.onehundred;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/25 0025 12:13
 */
public class AoBaMa {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        AoBaMa aoBaMa = new AoBaMa();
        aoBaMa.setAge(100);
        aoBaMa.setName("ppx");
        System.out.println(aoBaMa.getAge() + aoBaMa.getName());


    }
}
