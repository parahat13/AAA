package firstPackage;
import java.util.Scanner;

public class CaffeineOverdose {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink: ");
				int cafeeMilligram=input.nextInt();
				System.out.println("How many cups did you drink today?");
				int cupToday=input.nextInt();
				
				double caffGr=cafeeMilligram*0.001;
				double cupsLethal=10-caffGr;
				
				double perCupMg=cafeeMilligram/cupToday;
				double cupKillMg=cupsLethal/0.001;
								
				double cupsleft= cupKillMg/perCupMg;
				double cupsdrink=(int) cupsleft;
				
						
				int cupstotal=(int)cupsdrink+cupToday;
				
		 	
		System.out.println("It would take about "+cupstotal+" drinks for a lethal overdose.");
		
	}}