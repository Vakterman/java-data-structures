package seroglazov.arrays;

public class IntegerTuple {
	private int item1;
	private int item2;

	public IntegerTuple(final int item1, final int item2){
		this.item1 = item1;
		this.item2 = item2;
	}

	public int getItem1(){
		return item1;
	}

	public int getItem2(){
		return item2;
	}

	public static IntegerTuple emptyTuple(){
		return new IntegerTuple(0, 0);
	}

}
