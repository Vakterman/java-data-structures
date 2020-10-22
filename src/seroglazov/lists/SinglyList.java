package seroglazov.lists;

import java.util.NoSuchElementException;

public class SinglyList<T> {
    private int size = 0;

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

        size ++;
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

        size ++;
    }

    public void insertAtHead(final T data) {
        if(head == null){
            head = new ListNode<>(data);
        } else {
            ListNode<T> newHeadNode = new ListNode<>(data);
            newHeadNode.nextNode  = head;
            head = newHeadNode;
        }

        size ++;
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

    public void deleteAtHead() {
        if(head == null) {
            return;
        }

        if(head.nextNode != null) {
            head = head.nextNode;
        } else {
            head = null;
        }
    }

    public boolean delete(final T data) {
        if(head ==  null) {
            return false;
        } else if(head.getData().equals(data)) {
            head = head.nextNode;
            size --;
            return true;
        }

        final ListNode<T> previousNode = searchPreviousNode(data);
        if(previousNode == null){
            return false;
        }

        final ListNode<T> nodeWithData = previousNode.nextNode;
        if(nodeWithData.nextNode != null) {
            previousNode.nextNode = nodeWithData.nextNode;
        } else {
            previousNode.nextNode = null;
        }
        size --;
        return true;
    }

    private ListNode<T> searchPreviousNode(T data) {
        ListNode<T> tmp = head;
        while(tmp != null) {
            if(tmp.nextNode != null
                && tmp
                        .nextNode
                            .getData()
                                .equals(data)) {
                return tmp;
            }

            tmp = tmp.nextNode;
        }

        return null;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        ListNode<T> tmp = head;
        stringBuilder.append("[");
        while(tmp != null) {
            if(tmp.nextNode != null){
                stringBuilder
                        .append(tmp.data)
                        .append(",")
                        .append(" ");
            } else {
                stringBuilder.append(tmp.data);
            }

            tmp = tmp.nextNode;
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
