package basic.utils.format;

import java.util.Scanner;

public class FilterNumberAndCharacter {

	public static void main(String[] args) {
		System.out.println("请输入字符串......");
		Scanner scanner = new Scanner(System.in);

		String nextLine = scanner.nextLine();
		char[] charArray = nextLine.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (Character.isUpperCase(c) || Character.isDigit(c)) {
				System.out.print(c);

			}

		}

	}

}
