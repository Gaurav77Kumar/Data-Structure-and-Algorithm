package OOPS;

class Toy {}

public class Garbage_Collector {
    public static void main(String[] args) {
        Toy t1 = new Toy();  // You got a toy

        Toy t2 = new Toy();  // Another toy

        t1 = null;           // You dropped the first toy (no reference)
    }                        // After main ends, t2 also gets dropped
}


// Object lives in the heap memory and if no varibale is pointed to the object then
// Garbage collector run in the background and delete the unused object to free memory