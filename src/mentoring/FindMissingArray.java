package mentoring;

public class FindMissingArray {

	public static void main(String[] args) {

		int[] array = { 1, 5, 6, 8, 10, 15 };

		missedArray(array);
	}

	public static void missedArray(int[] givenArray) {

		for (int i = 0; i < givenArray[givenArray.length - 1]; i++) {

			boolean inside = false;

			for (int j = 0; j < givenArray.length - 1; j++) {

				if (givenArray[j] == i) {
					inside = true;
				}
			}

			if (inside != true) {
				System.out.print(i + " ");
			}
		}

	}

}
