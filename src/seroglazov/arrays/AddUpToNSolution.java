package seroglazov.arrays;

public class AddUpToNSolution {
		public static IntegerTuple findUpToN(int[] input, int searchValue) {
			QuickSort.sort(input, 0, input.length - 1);
			for(int i = 0; i < input.length; i++) {
				int firstItem = input[i];
				int secondItemIndex =
						BinarySearch.binarySearch(input,
								i+1,
								input.length -1 ,
								searchValue - firstItem);

				if(secondItemIndex > -1){
					return new IntegerTuple(firstItem, searchValue - firstItem);
				}
			}

			return IntegerTuple.emptyTuple();
		}
}
