package basic.pond.basic.other;

import java.util.Scanner;

public class IfAndElse {


	public static void main(String[] args) {
		System.out.println("please input you height");
		Scanner scanner = new Scanner(System.in);
		double nextInt = scanner.nextDouble();
		
		System.out.println("please input you weight");
		int next=scanner.nextInt();
		double total=next/(nextInt*nextInt);
		if(total<24 || total>=18.5){
			System.out.println("you are normal"+total);

		}
		else {
			System.err.println("tou are too fit");
		}

	}

}
