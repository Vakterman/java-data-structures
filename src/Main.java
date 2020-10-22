import seroglazov.arrays.ReArrange;
import seroglazov.lists.SinglyList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] input = {9, 4, 6,7, 8, 5};
//        int[] input2 = {1, 1, 1, 1, 0, 0, 0, 0};
//        QuickSort.merge(input2, 0, input2.length - 1);

       // System.out.println(input);
      //  int[] input = {1,21,3,14,5,60,7,6};
      //  final IntegerTuple index = AddUpToNSolution.findUpToN(input, 81);
       // QuickSort.sort(input, 0, input.length -1);
    //        int[] sortedArray1 = {1, 3, 4, 5};
    //        int[] sortedArray2 = {2, 6, 7, 8};
    //        int[] mergedArray = MergeSortedArrays.mergeSortedArrays(sortedArray1, sortedArray2);
       // final int[] input = {4,5,1,2,0,4};
       // int output = NonRepeatedItem.firstNotRepeatedItem(input);
       // int[] input = {1, 2, 3, 4};
        //int secondMaximumItem = SecondMaximumElement.findSecondMaximumItem(input);
        //CheckRotateArray.rotateArray(input);

        //int[] checkInput = {10, -1, 20, 4, 5, -9, -6};
        //int[] checkInput2 = {10, -1, 5, 6, -8, -4, -5};
        // ReArrange.reArrange(checkInput2);

        final SinglyList<Integer> list = new SinglyList<>();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(5);

        System.out.println(list.toString());
        // test delete head
        list.deleteAtHead();
        System.out.println(list.toString());
        list.deleteAtHead();
        System.out.println(list.toString());

        // test delete
        System.out.println(list.toString());
        list.delete(2);
        System.out.println(list.toString());
        list.delete(0);
        System.out.println(list.toString());
        list.delete(5);
    }
}
