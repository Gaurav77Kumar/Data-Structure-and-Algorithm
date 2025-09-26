package OOPS.StaticExample;

public class main {
    public static void main(String[] args) {
//        Human gaurav = new Human(22,"gaurav", 43344,false);
//        Human sanjana = new Human(23,"sanjana", 43344,false);
//
//
//
//        System.out.println(Human.population); // we can use the name like gaurav and sanjana but
//        System.out.println(Human.population); // convention is using Class name

//        greeting(); // This is showing red line because a non static can be used inside the static
    }
    // We know something that is belong to non static belong to objects

       static void fun(){
      //  greeting(); // You cannot use this here because it require an instances
       }
        void greeting() {
            System.out.println("Hii sanjana");
        }

}
