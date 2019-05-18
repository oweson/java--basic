package basic.jihekuanjia;

public class Student {
    int age = 100;

    @Override
    public String toString() {
        return "Student [age=" + age + "]";
    }

    public Student(int age) {
        super();
        this.age = age;
    }

}
