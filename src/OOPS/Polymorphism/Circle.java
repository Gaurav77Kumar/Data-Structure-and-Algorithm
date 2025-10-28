package OOPS.Polymorphism;

public class Circle extends Shapes{
    @Override  // this is called annotation
    // This will run obj of circle is created hence it is overriding the parent method
    void area(){
        System.out.println("Area of Circle is 3.14 * r * r");
    }
}
