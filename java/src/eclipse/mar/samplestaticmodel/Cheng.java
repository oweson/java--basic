package eclipse.mar.samplestaticmodel;

import org.junit.Test;

public class Cheng {
    private String name;
    private int age;
    private String looklike;

    @Override
    public String toString() {
        return "Cheng [name=" + name + ", age=" + age + ", looklike="
                + looklike + "]";
    }

    public Cheng(String name, int age, String looklike) {
        super();
        this.name = name;
        this.age = age;
        this.looklike = looklike;
    }

    public Cheng() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLooklike() {
        return looklike;
    }

    public void setLooklike(String looklike) {
        this.looklike = looklike;
    }

    @Test
    public void demo1() {
        System.out.println("hello,world!");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello,oweson");
        // TODO Auto-generated method stub

    }

}
