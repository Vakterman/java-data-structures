package seroglazov.arrays;

public class MaximumSumSubarray {
	public static int findMaxSumSubArray(int[] input){
		int maximum = 0;
		int sum = 0;
		for(int i = 0; i < input.length; i++){
			sum += input[i];
			if(maximum < sum){
				maximum = sum;
			}
		}

		return maximum;
	}
}
