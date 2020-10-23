package seroglazov.arrays;

public class CheckRotateArray {
	public static void rotateArray(int[] arr){
		final int firstIndex = 0;
		final int lastIndex = arr.length - 1;
		int item = shift(arr, lastIndex, firstIndex);

		for(int i = 1; i < lastIndex; i += 2){
			int tmp = shift(arr,i, i+1);
			arr[i] = item;
			item = tmp;
		}

		arr[lastIndex] = item;
	}

	private static int shift(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		return tmp;
	}
}
