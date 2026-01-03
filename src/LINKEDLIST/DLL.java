package LINKEDLIST;

public class DLL {                          // This is the doubly linked list class which contains methods to manipulate the list like inserteion, deletion and display

      Node head;

      public void insertFirst(int val){
          Node node = new Node(val);

          node.next = head;
          node.prev = null;
          if(head !=null){
              head.prev = node;
          }
          head = node;

      }

      public void inserAtLast(int val){      // Insert at the end of the doubly linked list
        Node node = new Node(val);           // Create a new node with the given value
        Node last = head;                    // Start from the head node to find the last node


        node.next = null;                   // New node will be the last node, so its next will be null

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;               // This will move to the last node
        }
        last.next = node;                    // Link the last node's next to the new node
          node.prev = last;                  // Link the new node's prev to the last node
      }

      public Node find(int val){
          Node node = head;
          while(node != null){
              if(node.value == val){
                  return node;
              }
              node = node.next;
          }
          return null;
      }

      public void insert(int after, int val){
          Node p = find(after);
          if(p == null){
              System.out.println("Does not exist");
              return;
          }
          Node node = new Node(val);

          node.next = p.next;
          p.next = node;
          node.prev = p;
          if(node.next != null){
              node.next.prev = node;
          }
      }

      public void display(){
          Node node = head;
          while(node != null){
                System.out.print(node.value + " <-> ");
                node = node.next;
          }
          System.out.println("END");

      }


    private class Node {                                    // This is the Node class representing each element in the doubly linked list
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {     // Contructor to initialize the node with value, next, and prev
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
