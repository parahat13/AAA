package mentoring;

public class FindMissingArr {

	public static void main(String[] args) {

		int[] array = { 2, 5, 6, 8, 10, 11, 15, 20 };

		findMissingNumber(array);

	}

	public static void findMissingNumber(int[] arg) {

		for (int i = 0; i < 20; i++) {
			boolean inside = false;

			for (int j = 0; j < arg.length - 1; j++) {

				if (arg[j] == i) {
					inside = true;
				}
			}

			if (inside != true) {
				System.out.print(i + " ");
			}
		}
	}

}
