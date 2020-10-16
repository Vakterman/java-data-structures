package seroglazov.arrays;

public class ReArrange {
	public static void reArrange(int[] arr) {
		//Write - Your - Code
		int left = 0;
		int right = arr.length - 1;

		while(left < right){
			if(arr[left] >=  0) {
				if(arr[right] < 0){
					swap(arr, left, right);
					left++;
					right--;
				} else {
					right --;
				}

			}  else if(arr[right] < 0){
				if(arr[left] >= 0) {
					swap(arr, left, right);
					left++;
					right--;
				} else {
					left++;
				}
			} else {
				left++;
				right--;
			}
		}
	}

	private static void swap(int[] arr, int left, int right){
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
