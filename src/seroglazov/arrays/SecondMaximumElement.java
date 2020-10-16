package seroglazov.arrays;

public class SecondMaximumElement {
	public static int findSecondMaximumItem(int[] items) {
		int maxItem = max(items);
		int secondMaxItem = Integer.MIN_VALUE;
		for (int item : items) {
			if (secondMaxItem < item && item < maxItem) {
				secondMaxItem = item;
			}
		}

		return secondMaxItem;
	}

	public static int max(int[] items) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < items.length; i++) {
			if(max < items[i]){
				max = items[i];
			}
		}

		return max;
	}
}
