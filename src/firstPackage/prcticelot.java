package firstPackage;

import java.util.Scanner;

public class prcticelot {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your name?");
		String firstName = keyboard.next();

		System.out.println("Nice name " + firstName);
		System.out.println("How old are you? " + firstName);
		String age = keyboard.next();

		System.out.println("You are too young " + firstName);
		System.out.println("How much is your jacket? ");
		int priceOfJacket = keyboard.nextInt();

		System.out.println("How much is shoes" + firstName);
		int shoePrice = keyboard.nextInt();
		int totalPrice = priceOfJacket + shoePrice;
		// String totalPrice=priceOfJacket+shoePrice;

		System.out.println("So all together will be " + totalPrice);

	}

}
