package OOPS.StaticExample;


// This is demo to show initialization of static variables

public class StaticInt {
    static int a = 4; // static means that it is associated with class not with object
    static int b;

//   will only ran once when the class is loaded in the memory because it is static
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.a += 3;

        System.out.println(StaticInt.a + " " + StaticInt.b);
        StaticInt obj2 = new StaticInt();  // static block will not be called again because it is called only once when the class is loaded
        System.out.println(StaticInt.a + " " + StaticInt.b);


    }
}
