package seroglazov.lists;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {
	private int size;

	public LinkedList() {}

	public LinkedList(Node<T> headNode) {
		this.head = headNode;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public void forEach(Consumer<? super T> action) {

	}

	@Override
	public Spliterator<T> spliterator() {
		return null;
	}

	public static class Node<T> {
		private Node<T> nextNode;
		private final T data;

		public Node(final Node<T> nextNode, T data) {
			this.nextNode = nextNode;
			this.data  = data;
		}

		public T getData() {
			return data;
		}
	}

	private Node<T> head = null;

	public Node<T> getHead() {
		return head;
	}

	public void insertAtEnd(T data) {
		Node<T> nextNodeForInsertion = head;

		while((nextNodeForInsertion != null)
				&& (nextNodeForInsertion.nextNode  != null)) {
			nextNodeForInsertion = nextNodeForInsertion.nextNode;
		}
		
		size++;
	}

	public boolean isEmpty() { return head == null;}
	
	private int getSize() {
		return size;
	}
}
