package OOPS.Polymorphism;

public class Number {

    int sum(int a, int b){
        return a + b;
    }
    int sum(int a , int b, int c){
        return a + b +c;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum(2,4);
        obj.sum(3,2,2);
    }
}
