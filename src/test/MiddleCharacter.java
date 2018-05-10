package test;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter  the word");

		String str = scan.nextLine();
		System.out.println(test(str));

	}

	public static String test(String word) {

		int position = 0;
		int lentgh = 0;

		if (word.length() % 2 == 0) {
			position = word.length() / 2 - 1;
			lentgh = 2;
		} else {
			position = word.length() / 2;
			lentgh = 1;
		}
		return word.substring(position, position + lentgh);
	}

}
