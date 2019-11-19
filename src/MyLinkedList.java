public class MyLinkedList {
    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private int count;

    public void append(int data){
        if(head == null){
            this.head = new Node(data);
            return;
        }

        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        count++;
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        count++;
    }

    //find node and skip the node we want to delete
    public void deleteWithValue(int data){
        if(head == null){ return; }
        //special case when we want to delete the dead value;
        if(head.data == data){
            head = head.next;
            count--;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                count--;
                return;
            }
        }
    }

    public boolean contains(int data){
        Node current = head;
        if(head == null) return false;

        while(current.next!=null){
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }
}
