package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.PrimitiveIterator.OfDouble;

public class UsingDateTime {
	
	public static void main(String[] args) {
		
	
		LocalDate today= LocalDate.of(1996, 5, 21);
		LocalDate today1= LocalDate.of(1996, Month.AUGUST, 21);
		
		System.out.println();
		
		
		
		LocalTime lunchTime1= LocalTime.of(13,55);
		System.out.println(lunchTime1);
		
		LocalTime lunchTime= LocalTime.of(13, 0, 55);
		System.out.println(lunchTime);
				
		LocalTime lunchTime3= LocalTime.of(13,55,05,5);
		System.out.println(lunchTime3);
		
		
		LocalDateTime  rightNow= LocalDateTime.of(2018,  Month.FEBRUARY, 11, 12, 29);
		
		
		LocalDateTime  twoYearsLater= rightNow.plusYears(2);
		
		LocalDateTime ld = twoYearsLater.plusYears(2);
		
		// 1Z0-808
		// JAVASE8 PROGRAMMER1
		
		
		
	}

	
	
	
}
