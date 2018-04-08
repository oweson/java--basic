package com.itheima.xunhan;

import java.util.Scanner;

public class IsYunYear {
	/*
	 * 1. 如果能够被4整除，但是不能被100整除 2. 能够被400整除
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a year");
		int nextInt = scanner.nextInt();
		if ((nextInt % 4 == 0 && nextInt % 100 != 0) || !(nextInt % 400 != 0)) {
			System.err.println("yes");
		}
		// TODO Auto-generated method stub

	}

}
