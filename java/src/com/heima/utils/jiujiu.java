package com.heima.utils;

public class jiujiu {
	public static void testSth() {
		System.out.println("hello");
	}

	public static void test() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		jiujiu.test();
		jiujiu.testSth();
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
