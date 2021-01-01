package basic.pond.basic.samplestaticmodel;

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



    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello,oweson");

    }

}
