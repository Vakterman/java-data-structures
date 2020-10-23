package seroglazov.arrays;

import static seroglazov.arrays.ArrayUtils.swap;

public class MaxMinSortedArray {
	public static void minMax(int[] input) {
		reverseArray(input);
		int nextMaximum = input[1];

		int j = input.length - 1;
		for(int i = 1; i < input.length - 1 && (i <= j); i++){
			input[i] = input[j--];
			int tmp = input[++i];
			input[i] = nextMaximum;
			nextMaximum = tmp;
		}
	}

	public static void reverseArray(int[] array){
		int i = 0;
		int j = array.length - 1;
		while(i < j) {
			swap(array, i++, j--);
		}
	}
}
