package mentoring;

import java.util.Arrays;

public class AddArrays {
	
	public static void main(String[] args) {

		String[] jobId = new String[4];

		jobId[0] = "DEV";
		jobId[1] = "PO";
		jobId[2] = "BA";
		jobId[3] = "QA";

		
//		for (String string : jobId) {
//			System.out.println(string);
//		}

		String [] newJobId=Arrays.copyOf(jobId, 5);
		newJobId[4]="PM";
		System.out.println(Arrays.toString(newJobId));
		
//		for (String string : newJobId) {
//			System.out.println(string);
//		}

}
}