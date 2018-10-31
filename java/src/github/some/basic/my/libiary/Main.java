package github.some.basic.my.libiary;/*package com.heima.libiary;
import java.util.Scanner;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		System.out.println("*****ͼ��ݲ���ϵͳ*****");
		Scanner input = new Scanner(System.in);
		Books books = new Books();
		BookSystem bs = new BookSystem();
		while(true) {
		System.out.println("�������1-�����Ʋ���ͼ�飬2-������Ų���ͼ��,0-�˳�ϵͳ");
		try {
			int x = input.nextInt();
			if(x==1) {
				bs.nameBook();
			}
			else if(x==2) {
				bs.numBook();
			}
			else if(x ==0) {
				//System.out.println("ϵͳ���˳����ݰ�");
				break;
			}
			}catch(Exception e) {	
			System.out.println("������������������ʾ��������");
			input.next();
			continue;
		}
	}	
		System.out.println("ϵͳ�����˳�...");
		Thread.sleep(70*60*1);
		System.out.println("ϵͳ����ȫ�˳����ݰ�");
		input.close();
	}
}
*/