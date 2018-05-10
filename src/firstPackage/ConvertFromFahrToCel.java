package firstPackage;

import java.util.Scanner;

public class ConvertFromFahrToCel {

	public static void main(String[] args) {

		

		System.out.println("Enter the temp in  Fahraneit");

		 Scanner abc=new Scanner(System.in);
		 
		 float temp;
		
		 temp=abc.nextFloat();
		 temp=((temp-32)*5)/9;
		
		 System.out.println(temp);
		 
		 System.out.println("=======================================");

//		double temp1 = 213;
//
//		temp1 = ((temp1 - 32) * 5) / 9;
//		System.out.println("Temperature in  Celcius is: " + temp1);

	}

}
