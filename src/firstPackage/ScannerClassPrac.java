package firstPackage;

import java.util.Scanner;

public class ScannerClassPrac {

	public static void main(String[] args) {

		int minInYear = 60 * 24 * 365;
		Scanner pen = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		int min = pen.nextInt();

		int years = min / minInYear;
		int days = (min / 60 / 24) % 365;
		System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");

	}

}
