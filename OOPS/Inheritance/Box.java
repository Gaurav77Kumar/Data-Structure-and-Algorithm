package OOPS.Inheritance;

public class Box {  // This is the box class that have 3 properties
    double length;
    double breadth;
    double height;

    Box() {   // This is the default constructor which mean if anybody creates box without any value it will set it to -1
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }

    Box(double l, double b, double h) {  // This is also the construtor but in call when you give 3 arguments in the function
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    Box(double side) {  // if you just pass one  side like for cube it set all the l, b, h to that side
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    Box(Box old) { //
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
