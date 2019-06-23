package basic.ocean.inject;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月17日 上午8:04:04 类说明：侵权必究。。。。。。。
 */

public class People {
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static void main(String[] args) {
        People people = new People();
        Student student = new Student();
        student.setId(21);
        student.setName("ppx");
        /**把student属性注入到people中；
         * */
        people.setStudent(student);
        System.out.println(people.student.id);
        System.out.println(people.student.name);


    }
}
