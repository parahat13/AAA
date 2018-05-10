package mentoring;

public class FindDuplicateElements {

	public static void main(String[] args) {

		

		int[] num = { 1, 1, 2, 2, 3, 5, 6, 7, 8, 9, 10, 10 };

		findUnique(num);

	}

	public static  void findUnique(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			boolean bool = false;

			for (int j = 0; j < i; j++) {

				if (nums[i] == nums[j]) {
					bool = true;
					break;
				}

			}

			if (!bool) {
				System.out.print(nums[i] + " ");
			}
		}

	}

}
