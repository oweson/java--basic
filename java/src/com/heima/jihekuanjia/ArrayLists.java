package com.heima.jihekuanjia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		int count=0;
		List list = new ArrayList<>();
		for (int i = 0; i < 101; i++) {
			list.add(new student("haha"));
		}
		Object[] array = list.toArray();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			count++;
			System.out.print(iterator.next());System.out.println(count);
		}
	
		System.out.println(list.size());
		// TODO Auto-generated method stub

	}

}

class student {
	String name;

	public student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [name=" + name + "]";
	}

}
