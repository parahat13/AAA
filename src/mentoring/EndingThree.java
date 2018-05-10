package mentoring;

public class EndingThree {

	public static void main(String[] args) {

		int[] array = { 5, 3, 16, 23, 45, 53, 61, 73 };

		//printThree(array);
		print(array);
	}

//	public static  void printThree(int[] num) {
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 10 == 3) {
//				System.out.println(num[i]);
//			}
//		}
//
//	}
		
		public static  void print(int [] num) {
			for (int i = 0; i < num.length; i++) {
				
				if(num[i]%10==3) {
					System.out.println(num[i]);
				}
			}
		}

}