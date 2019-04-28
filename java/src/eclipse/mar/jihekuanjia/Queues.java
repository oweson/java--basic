package eclipse.mar.jihekuanjia;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        LinkedList<Student> lStudents = new LinkedList<>();
        Queue<Student> q = new LinkedList<>();
        q.offer(new Student(21));
        q.offer(new Student(211));
        q.offer(new Student(21111));
        q.offer(new Student(21111));
        q.offer(new Student(2111111));
        //1 因为是队列先进先出；
        //2 在末尾进行添加；
        //Studentss poll = q.poll();
        // 进行取之；
        // 弄出来就没有了；
        //System.out.println(poll);
        System.out.println(q);
        //只是查看；
        Student peek = q.peek();
        System.out.println(peek);
        System.out.println(q);
		
		
		/*lStudents.addFirst(new Studentss(21));
		lStudents.addFirst(new Studentss(22));
		lStudents.addFirst(new Studentss(23));
		lStudents.addFirst(new Studentss(24));
		lStudents.addLast(new Studentss(10));
		System.out.println(lStudents.getFirst());
		// 1查看最前面的元素；
		Iterator<Studentss> iterator = lStudents.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}*/
    }
}
