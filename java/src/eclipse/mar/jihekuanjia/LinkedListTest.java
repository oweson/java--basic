package eclipse.mar.jihekuanjia;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        java.util.LinkedList<Student> lStudents = new java.util.LinkedList<>();
        lStudents.addFirst(new Student(21));
        lStudents.addFirst(new Student(22));
        lStudents.addFirst(new Student(23));
        lStudents.addFirst(new Student(24));
        lStudents.addLast(new Student(10));
        System.out.println(lStudents.getFirst());
        // 1 查看最前面的元素；
        Iterator<Student> iterator = lStudents.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
