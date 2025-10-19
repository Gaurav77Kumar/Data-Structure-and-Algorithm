package OOPS.Inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;

    }
        BoxPrice(BoxPrice other){
            super(other);
            this.cost = other.cost;
        }

        public BoxPrice(double length, double breadth, double height, double weight, double cost) {
        super(length, breadth, height, weight); //
        this.cost = cost;
    }

}
