package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,6,8);  // call constructor when you give 3 arguments in the function
//        System.out.println(box.length + " " + box.breadth + " " + box.height);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box3.height + " " + box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 5); // This means a BoxWeight object is created but reference is of Box type and only Box class members are accessible
        System.out.println(box5.height);

        // there are many variables in both parent and child class
        // you are given access to variables that are in the ref type i.e BoxWeight
        // hence, you also have to access to weight variables
        // this also means, that the ones you are trying to access should be initialised
        // but here, when object itself is of type parent class, how will you call the constructor of child class

//        BoxWeight box6 = new Box(2,3,2); // This is not allowed because a Box object cannot be treated as a BoxWeight object and
//        System.out.println(box6);

        BoxPrice box = new BoxPrice();
        BoxPrice box1 = new BoxPrice(2,3,4,5,6);


    }
}
