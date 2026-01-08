package LINKEDLIST;

public class ReverseLinkedList {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    // INSERT AT THE END OF THE LINKED LIST
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

  // DISPLAY THE LINKED LIST
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // REVERSE THE LINKED LIST USING RECURSION
    public void reverse() {
        if (head == null) {
            return;
        }
        reverse(head);
    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // REVERSING THE LINKED LIST USING ITERATION
    public void reverseIterative(){
        Node prev = null;
        Node current = head;
        Node next = current.next;

        while(current!=null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }




   // MAIN METHOD TO TEST THE FUNCTIONALITY
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.println("Before Reverse:");
        list.display();
     //   list.reverse();
        list.reverseIterative();

        System.out.println("After Reverse:");
        list.display();

    }
}

