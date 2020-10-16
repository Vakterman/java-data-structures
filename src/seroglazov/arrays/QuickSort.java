package seroglazov.arrays;

public class QuickSort {
	public static void sort(int[] input, int left, int right) {
		if(left < right) {
			int pivotItemIndex = right;
			int j = left - 1;
			for (int i = left; i <= right - 1; i++){
				if(input[i] <= input[pivotItemIndex]) {
					j++;
					swap(input, j, i);
				}
			}

			swap(input, j + 1, pivotItemIndex);
			sort(input, left, j - 1);
			sort(input, j + 1, right);
		}
	}

	private static void swap(int[] input, int firstIndex, int secondIndex) {
		int tmp = input[firstIndex];
		input[firstIndex]  = input[secondIndex];
		input[secondIndex] = tmp;
	}
}
