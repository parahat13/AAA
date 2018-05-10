package mentoring;

import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		

boolean res = hasDuplicates(new int[] { 5, 3, 10, 1 });
		System.out.println(res);

		res = hasDuplicates(new int[] { 5, 3, 10, 1, 5 });
		System.out.println(res);
	}

	public static boolean hasDuplicates(int[] nums) {

//		if (nums.length <= 1)
//			return false;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;

	}

	public static boolean hasDuplicates(List<Integer> nums) {
//		if (nums.size() <= 1)
//			return false;

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {

				if (nums.get(i) == nums.get(j)) {
					return true;
				}
			}
		}
		return false;

	}

}
