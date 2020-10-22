package seroglazov.arrays;

public class ArrayUtils {
	public static void swap(int[] arr, int left, int right){
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
