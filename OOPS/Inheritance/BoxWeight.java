package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double length, double breadth, double height, double weight){
        super(length, breadth,height);// This is calling the parent class constructor
        this.weight = weight; //
    }

   BoxWeight(BoxWeight other) {
       super(other); // Calling parent class copy constructor
       this.weight = other.weight;
   }
}
