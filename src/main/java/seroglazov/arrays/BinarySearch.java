package seroglazov.arrays;

public class BinarySearch {
	public static int binarySearch(int[] input, int searchValue) {
		int start = 0;
		int end = input.length - 1;
		while(start <=  end){
			int mid = start + (end - start) / 2;
			if(searchValue > input[mid]) {
				start = mid + 1;
			} else if (searchValue < input[mid]) {
				end = mid;
			}  else return mid;
		}

		return -1;
	}


	public static int binarySearch(int[] input, int start, int end, int searchValue) {
		if(start > end) return -1;

		int mid = start + (end - start) / 2;
		if(searchValue > input[mid]) {
			return binarySearch(input, mid + 1, end, searchValue);
		} else if (searchValue < input[mid]) {
			return binarySearch(input, start, mid - 1, searchValue );
		}  else return mid;
	}
}
