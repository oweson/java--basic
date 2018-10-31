package chapter03;

public class Student {
    public int age;
    public String name, sno;

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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name, String sno) {
        super();
        this.age = age;
        this.name = name;
        this.sno = sno;
    }

    public int getAge1() {
        // TODO Auto-generated method stub
        return 0;
    }


}
