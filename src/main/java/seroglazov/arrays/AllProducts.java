package seroglazov.arrays;

public class AllProducts {
	public static int[] findProduct(final int[] input){
		final int[] output = new int[input.length];
		int entireProduct = 1;
		int numberOfZeroItems = 0;
		int zeroIndex = -1;

		for(int j = 0; j < input.length; j++) {
			if(input[j] == 0){
				zeroIndex = j;
				numberOfZeroItems += 1;
				if(numberOfZeroItems > 1){
					break;
				}
			} else {
				entireProduct *= input[j];
			}
		}

		if(numberOfZeroItems > 1){
			for(int i = 0; i < input.length; i++){
				output[i] = 0;
			}
		} else {
			for(int i = 0; i < input.length; i++) {
				if(zeroIndex != i && (zeroIndex > -1)){
					output[i] = 0;
				} else if(zeroIndex == i) {
					output[i] = entireProduct;
				} else {
					output[i] = entireProduct / input[i];
				}
			}
		}

		return output;
	}
}
