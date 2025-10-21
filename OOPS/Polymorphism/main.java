package OOPS.Polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();  //
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        square.area();
        circle.area();

    }
}
