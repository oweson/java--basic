package com.heima.jihekuanjia;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListS {

	public static void main(String[] args) {
		// LinkedListS<Student> lS =new LinkedListS();
		LinkedList<Studentss> lStudents = new LinkedList<>();
		lStudents.addFirst(new Studentss(21));
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

		// TODO Auto-generated method stub

	}

}
