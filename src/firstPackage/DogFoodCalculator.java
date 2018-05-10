package firstPackage;

import java.util.Scanner;

public class DogFoodCalculator {

	public static void main(String[] args) {
		Scanner Food = new Scanner(System.in);
		
		System.out.println("Enter number of dogs ");
		int numberOfDogs = Food.nextInt();
		
		System.out.println("-Enter number of days");
		int numberOfDays=Food.nextInt();
		
		int wetFoodPerDay=2;
		int veggies=2;
		int dryFoodPerDay=1;
		
		int totalWetFood=wetFoodPerDay*numberOfDogs*numberOfDays;
		int totalDryFood=numberOfDogs*numberOfDays*dryFoodPerDay;
		int totalVeggies=numberOfDogs*numberOfDays*veggies;
		
		System.out.println("In "+numberOfDays+" days your dog eats "+totalWetFood+" oz of wet food.");
		System.out.println("And in "+numberOfDays+" days it eats "+totalDryFood+" oz of dry food.");
		System.out.println("And in "+numberOfDays+" days it eats "+totalVeggies+" oz of dry food.");
	}

}
