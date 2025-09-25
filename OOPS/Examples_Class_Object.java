package OOPS;

public class Examples_Class_Object {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());

        Rectangle re = new Rectangle();
        re.length = 4;
        re.breadth = 5;
        System.out.println("Rectangle Area: " + re.area());
        System.out.println("Rectangle Perimeter: " + re.perimeter());
    }
}

// ✅ Square class
class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

// ✅ Rectangle class
class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}
