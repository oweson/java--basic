package github.some.basic.my.libiary;/*package com.heima.libiary;
import java.util.*;
public class BookSystem  {
	Scanner input = new Scanner(System.in);
	Books books = new Books();
	public void nameBook() throws BadCommandException{
	try {
		//int x = input.nextInt();
			System.out.println("请输入图书名字");
			String bookName =  input.next(); 
			//int num = books.selectNum(bookName);
			int   num=0;
			if(num == -1) {
				comEx();
			}
				System.out.println("ͼ�����ƣ�"+bookName);
			
		}catch(BadCommandException e) {
			System.out.println("ͼ�鲻���ڣ�����");
		}
	}
	public void numBook() throws BadCommandException{
		try {
			System.out.println("������ͼ����ţ�");
			int bookNum = input.nextInt();
			String bookName2 = books.selectName(bookNum);
			if(bookName2.equals("0")) {
				System.out.println("��Ŵ���");
				nameEx();
			}else {
				System.out.println("ͼ�����ƣ�"+bookName2);
			}
		}catch(NameException e) {
			System.out.println("��������ȷ�����");
		}catch (InputMismatchException e) {
			System.out.println("��Ӧ����������");
			// TODO: handle exception
		}
//		else if(x ==0) {
//			//System.out.println("ϵͳ���˳����ݰ�");
//			break;
//		}
//		}catch(Exception e) {	
//		System.out.println("������������������ʾ��������");
//		input.next();
//		continue;
	}
		public void comEx() throws BadCommandException{
			throw new BadCommandException();
		}
		public void nameEx() throws NameException{
			throw new NameException();
		}
		public void numEx() throws NumException{
			throw new NumException();
		}
}
*/