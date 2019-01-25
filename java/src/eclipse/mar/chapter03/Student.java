package eclipse.mar.chapter03;

import java.util.Objects;

public class Student implements Comparable<Student> {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        student.setName("aaa");
        student1.setName("aaa");
        student2.setName("bbb");
        /**true--0*/
        System.out.println(student.compareTo(student1));
        /**false----  -1*/
        System.out.println(student.compareTo(student2));
        /**true 0*/
        System.out.println(student.compareTo(student));
    }

    public Student() {
    }

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
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getSno(), student.getSno());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAge(), getName(), getSno());
    }

    @Override
    public int compareTo(Student student) {
        if (this.getName().compareTo(student.getName()) > 0) {
            return 1;
        } else if (this.getName().compareTo(student.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}
