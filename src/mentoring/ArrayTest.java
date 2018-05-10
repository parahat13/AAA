package mentoring;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		String[] array= new String[2];
		
		array[0]="QA";
		array[1]="DEV";
		//array[2]="PM";
		
		//System.out.println(Arrays.toString(array));
//		
//		for(String str:array) {
//			System.out.println(str);
//		}
		
		String[] newArray=Arrays.copyOf(array, 3);
		newArray[2]="PM";
		
		System.out.println(Arrays.toString(newArray));
		
	}

}
