package seroglazov.lists;

import java.util.NoSuchElementException;

public class SinglyList<T> {
    public static class ListNode<T> {
        private ListNode<T> nextNode;
        private T data;

        public ListNode(final T data) {
            this.data = data;
            this.nextNode = null;
        }

        public T getData() {
           return data;
        }

        public ListNode<T> getNextNode() {
            return nextNode;
        }
    }

    private ListNode<T> head = null;

    public ListNode<T> getHead() { return head; }

    public void insertAtEnd(final T data){

        if(head == null) {
            head = new ListNode<>(data);
        } else {
            ListNode<T> nodeForInsertion = head;

            while(nodeForInsertion.nextNode != null) {
                nodeForInsertion = nodeForInsertion.nextNode;
            }

            insertAt(data, nodeForInsertion);
        }
    }

    private void insertAt(T data, ListNode<T> node) {
        node.nextNode = new ListNode<>(data);
    }

    public void insertAfter(final T data, final T previousData) {
          final ListNode<T> previousNode =  searchNode(previousData);
          if(previousNode == null){
              throw new NoSuchElementException();
          }

          insertAt(data, previousNode);
    }

    public boolean search(final T data) {
        ListNode<T> node = searchNode(data);
        return node != null ;
    }

    private ListNode<T> searchNode(final T data) {
        if(head != null) {
            ListNode<T> node = head;
            while(node != null) {
                if(node.getData().equals(data)) {
                    return node;
                }

                node = node.nextNode;
            }
        }

        return null;
    }
}
