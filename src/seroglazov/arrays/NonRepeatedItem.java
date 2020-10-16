package seroglazov.arrays;

public class NonRepeatedItem {
	public static int firstNotRepeatedItem(int[] input){
		int firstNonRepeatedItem = Integer.MIN_VALUE;

		for (int j : input) {
			if (firstNonRepeatedItem == Integer.MIN_VALUE) {
				firstNonRepeatedItem = j;
			} else if (j == firstNonRepeatedItem) {
				firstNonRepeatedItem = Integer.MIN_VALUE;
			}
		}

		return firstNonRepeatedItem;
	}
}
