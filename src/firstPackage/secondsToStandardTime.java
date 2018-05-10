package firstPackage;

import java.util.Scanner;

public class secondsToStandardTime {

	public static void main(String[] args) {
		Scanner clock = new Scanner(System.in);
		int minuteInHour = 60;
		int secondInMinute = 60;

		int second;
		int minute;
		int hour;
		System.out.println("Enter seconds: ");
		second = clock.nextInt();

		minute = second / secondInMinute;
		second = second - minute * secondInMinute;

		hour = minute / minuteInHour;
		minute = minute - hour * minuteInHour;
		System.out.println(hour + " hours," + minute + " minutes, and " + second + " seconds.");
	}

}
