package seroglazov.lists;

public class DoublyLinkedList<T> {
	private int size = 0;

	private ListNode<T> head = null;

	public static class ListNode<T> {
		private final T data;
		private ListNode<T> previousNode;
		private ListNode<T> nextNode;

		public ListNode(final T data,
						final ListNode<T> previousNode,
						final ListNode<T> nextNode) {
			this.data =data;
			this.previousNode = previousNode;
			this.nextNode = nextNode;
		}

		public T getData() { return data; }

		private void setPreviousNode(final ListNode<T> nextNode) {
			this.nextNode = nextNode;
		}

		private void setNextNode(final ListNode<T> nextNode) {
			this.nextNode = nextNode;
		}

		public ListNode<T> getNextNode() {
			return nextNode;
		}

		public ListNode<T> getPreviousNode() {
			return previousNode;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	public void insertAtHead(final T data) {
		if(head == null) {
			this.head = new ListNode<>(data, null, null);
		} else {
			final ListNode<T> newHeadNode = new ListNode<>(data, null, head);
			head.setPreviousNode(newHeadNode);
			head = newHeadNode;
 		}
	}

	public int length() {
		int length = 0;
		ListNode<T> node = head;
		if(node == null) {
			return length;
		}

		while(node != null) {
			node = node.nextNode;
			length++;
		}

		return length;
	}

	public T getHead() {
		return head.getData();
	}

//	@Override
//	public String toString() {
//		final StringBuilder stringBuilder = new StringBuilder();
//		ListNode<T> listNode = head;
//		stringBuilder.append("[");
//		while(listNode != null){
//			if(listNode.nextNode != null) {
//				stringBuilder.append(listNode.data).append(",").append(" ");
//			} else {
//				stringBuilder.append(listNode.data);
//			}
//
//			listNode = listNode.nextNode;
//		}
//
//		stringBuilder.append("]");
//
//		return stringBuilder.toString();
//	}
}
