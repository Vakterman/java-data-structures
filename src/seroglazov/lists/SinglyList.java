package seroglazov.lists;

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

    public void insertAtEnd(T data){

        if(head == null) {
            head = new ListNode<>(data);
        } else {
            ListNode<T> nodeForInsertion = head;

            while(nodeForInsertion.nextNode != null) {
                nodeForInsertion = nodeForInsertion.nextNode;
            }

            nodeForInsertion.nextNode = new ListNode<>(data);
        }
    }
}
