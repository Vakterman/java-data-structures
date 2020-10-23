package seroglazov;

import seroglazov.lists.LinkedList;
import seroglazov.lists.SinglyList;

import java.util.HashSet;
import java.util.Set;

public class ListUtils {
	public static <T> void reverse(final SinglyList<T> list){
		SinglyList.ListNode<T> currentItem = list.getHead();
		if(currentItem == null || currentItem.getNextNode() == null)
			return;
		SinglyList.ListNode<T> previousNode = currentItem;
		currentItem = currentItem.getNextNode();

		while(currentItem != null){
			list.insertAtHead(currentItem.getData());
			previousNode.setNextNode(currentItem.getNextNode());
			currentItem = currentItem.getNextNode();
		}
	}

	public static <T> SinglyList<T> intersection(SinglyList<T> first, SinglyList<T> second) {
		final Set<T> set = new HashSet<>();
		final SinglyList<T> intersectionList = new SinglyList<>();
		SinglyList.ListNode<T> firstListNode = first.getHead();
		SinglyList.ListNode<T> secondListNode = second.getHead();

		while(firstListNode != null) {
			set.add(firstListNode.getData());
			firstListNode = firstListNode.getNextNode();
		}

		while(secondListNode != null) {
			if(set.contains(secondListNode.getData())) {
				intersectionList.insertAtEnd(secondListNode.getData());
			}
			secondListNode = secondListNode.getNextNode();
		}

		return intersectionList;
	}

	public static <T> SinglyList<T> union(SinglyList<T> first, SinglyList<T> second) {
		final Set<T> set = new HashSet<>();
		final SinglyList<T> unionList = new SinglyList<>();
		SinglyList.ListNode<T> firstListNode = first.getHead();
		SinglyList.ListNode<T> secondListNode = second.getHead();

		while(firstListNode != null) {
			set.add(firstListNode.getData());
			unionList.insertAtEnd(firstListNode.getData());
			firstListNode = firstListNode.getNextNode();
		}

		while(secondListNode != null) {
			if(!set.contains(secondListNode.getData())) {
				unionList.insertAtEnd(secondListNode.getData());
			}

			secondListNode = secondListNode.getNextNode();
 		}

		return unionList;
	}
}
