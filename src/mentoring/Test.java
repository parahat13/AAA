package mentoring;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//Find unique  number

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!nums.contains(a[i])) {
				nums.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}

				if (k == 1) {
					System.out.println(a[i]);
				}
			}

		}

	}

}
