package com.heima.format;

import java.util.Scanner;

public class TestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入人名字");
		String nextLine = scanner.nextLine();
		// String nextLine2 = nextLine3;
		// String nextLine = nextLine2;
		System.out.println("请输入公司.....");
		//String line = scanner.nextLine();
		String format = "%s最大倒闭了，王八蛋老板吃喝嫖赌，";
		System.out.format(format, nextLine);
		// 这是格式化输出；
	}

}
