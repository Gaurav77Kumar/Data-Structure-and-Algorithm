package OOPS.StaticExample;

public class Human {
    int age;
   String name;
   int salary;
   boolean married;
   static long population;

   static void message(){
       System.out.println("Hello world");
   //  System.out.println(this.age); // You cannot use this because this is object dependent but the static is not objet dependent
   }

    public Human(int age, String name, int salary, boolean married ) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;

        Human.message();

    }
}
