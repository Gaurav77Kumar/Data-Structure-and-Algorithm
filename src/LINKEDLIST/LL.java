package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;          // When linked list is created size is 0 and head and tail is null
    }

public void insertFirst(int val) {     // Insert at the beginning
        Node node = new Node(val);     // Create a new node with the given value
        node.next = head;              // point the new node's next to the current head
        head = node;                   // update head to the new node

    if(tail == null){                  // If the list was empty, set tail to the new head
        tail = head;                   // only one element
    }
    size += 1;                         // Increment size of the linked list
}

public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);           // Create a new node with the given value
        tail.next = node;                    // point the current tail's next to the new node
        tail = node;                         // update tail to the new node
        size++;
}
public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;                 // This means we are starting from head
       for(int i = 1; i < index; i++){    // Move to the node just before the index
        temp = temp.next;                 // Move to the next node
    }
    Node node = new Node(val);            // Create a new node with the given value
    node.next = temp.next;                // Point the new node's next to the current node at the index
    temp.next = node;                     // Point the previous node's next to the new node
}

public int DeleteFirst() {
        int val = head.value;                 // Store the value of the head node
      head = head.next;                       // update head to the next node
      if(head == null){
        tail = null;
    }
    size--;
    return val;                           // Return the value of the deleted node

}
public int DeleteLast(){
        if(size <= 1){
            return DeleteFirst();
        }
        Node secondLast = get(size - 2);               // Get the second last node
        int val = tail.value;                          // Store the value of the tail node
        tail = secondLast;                             // Update tail to the second last node
        tail.next = null;                             // Set the new tail's next to null
       size--;
       return val;                                   // Return the value of the deleted node
}

public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
}

public int DeleteAtIndex(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if(index == size - 1){
            return DeleteLast();
        }
        Node prev = get(index - 1);            // Get the node just before the index
       int val = prev.next.value;                // Store the value of the node to be deleted
       prev.next = prev.next.next;                // Bypass the node to be deleted
       size--;
       return val;                              // Return the value of the deleted node

}


public void display() {                               // Display the linked list
        Node temp = head;                             // Start from the head
        while(temp != null) {                         // Traverse until the end of the list
            System.out.print(temp.value + " -> ");    // Print the value of the current node
            temp = temp.next;                         // Move to the next node
        }
    System.out.println("END");
}

    private class Node {
         private int value;
         private Node next;

         public Node(int value) {
             this.value = value;
             this.next = next;
         }
     }
}
