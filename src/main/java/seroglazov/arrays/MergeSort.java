package seroglazov.arrays;

public class MergeSort {

	private static void splitAndSort(int[] input, int leftIndex, int mid, int rightIndex) {
		int leftArraySize = mid - leftIndex + 1;
		int rightArraySize = rightIndex - mid;
		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightArraySize];

		for(int i = 0; i < leftArraySize; i++){
			leftArray[i] = input[i];
		}

		for(int j = 0; j < rightArraySize; j ++) {
			rightArray[j] = input[mid + j + 1];
		}

		int i = 0;
		int j = 0;
		int k = 0;
		while(i < leftArraySize && j < rightArraySize) {
			if(leftArray[i] <= rightArray[k]) {
				input[k] = leftArray[i];
				i ++;
			} else {
				input[k] = rightArray[j];
				j++;
			}

			k++;
		}

		while(i < leftArraySize) {
			input[k] = leftArray[i];
			i++;
			k++;
		}

		while(j < rightArraySize) {
			input[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void merge(int[] input, int left, int right) {
		if(right > left) {
			int mid = left + (right - left) / 2;
			merge(input, left, mid);
			merge(input, right, mid + 1);

			splitAndSort(input, left, mid,  right);
		}
	}
}
