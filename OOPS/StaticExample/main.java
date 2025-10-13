package OOPS.StaticExample;

import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args) {
//        Human gaurav = new Human(22,"gaurav", 43344,false);
//        Human sanjana = new Human(23,"sanjana", 43344,false);

//        System.out.println(Human.population); // we can use the name like gaurav and sanjana but
//        System.out.println(Human.population); // convention is using Class name

//        greeting(); // This is showing red line because a non static can be used inside the static
    }
    // We know something that is belong to non static belong to objects

       static void fun(){
      //  greeting(); // You cannot use this here because it require an instances
           // but the function you are using it does not depend on instances

           // You cannot access non static stuff without referencing their instances in a static context


           // hence here I am referencing it
           main obj = new main();
           obj.greeting();
       }

       void fun2(){
        greeting();
       }

       // we know that something which is non static , belong to an object

        void greeting() {
               fun();
            System.out.println("Hii sanjana");
        }

}
