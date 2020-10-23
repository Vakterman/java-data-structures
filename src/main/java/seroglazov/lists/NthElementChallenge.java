package seroglazov.lists;

public class NthElementChallenge {
	public static <T> SinglyList.ListNode<T> nthElementFromEnd(final SinglyList<T> list, int n) {
		// Write -- Your -- Code
		if(list.isEmpty()) return null;
		if(n > list.getSize()) {
			return null;
		}

		int itemPosition = list.getSize() - n + 1;
		int count = 0;
		SinglyList.ListNode<T> node = list.getHead();
		while(node != null){
			if(count == itemPosition) {
				return node;
			}
			node = node.getNextNode();
		}

		return null;
	}
}
