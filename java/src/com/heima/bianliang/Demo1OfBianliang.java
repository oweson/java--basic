package com.heima.bianliang;

public class Demo1OfBianliang {
	public static void demo1() {
		/*
		 * 一个变量的类型，决定了该变量可以包含什么样的值。 Java中有八种基本类型，都是Java语言预先定义好的，并且是关键字。
		 * 
		 * 这八种基本类型分别是： 整型 （4种） 字符型 （1种） 浮点型 （2种） 布尔型（1种）
		 */
		byte a = 1;
		System.out.println(a);
	}

	public static void demo2() {
		float a = 210f;
		float b = (float) 21.0;
		System.out.println(a);
		// System.out.println(a instanceof (float));
	}

	static void demo3() {
		long a = 211l;
		// 末尾是l是long性的
		long aa = 21l;
		System.out.println(a);
	}
	static void demo6(){
		int a=100;
		{
			//这是字块；
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		demo6();
		// demo4();
		// TODO Auto-generated method stub

	}

	static void demo4() {
		char a = 'a';
		int b = a;
		System.out.println(b);
		System.out.println(a);
	}

	static void demo5() {
		short a = 1;
		short b = 2;
		a = (short) (a + b);
		// 即使是short想家夜班成了int。所以要注意；
		System.out.println(a);
	}

}
