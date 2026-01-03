package LINKEDLIST;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;             // Point to itself to make it circular
        } else {
            tail.next = node;             // Link the new node after tail
            tail = node;                  // Update tail to the new node
            tail.next = head;             // Make it circular by pointing tail's next to head
        }
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;

            } while (node != head);
            System.out.println("(head: " + head.value + ")");

        }
    }

    public void delete(int value) {
        if (head == null) {
            return;                            // List is empty
        }

        // If the node to be deleted is the head node
        if (head.value == value) {
            if (head == tail) {               // Only one node in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;             // Update tail's next to new head
            }
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            previous = current;
            current = current.next;

            if (current.value == value) {
                previous.next = current.next;
                if (current == tail) {             // If tail is to be deleted
                    tail = previous;
                }
                return;
            }
        } while (current != head);
    }






    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
