package OOPS.StaticExample;

// Outside class cannot be static because it is not associated with any class
// but inside a class it can be static because it is associated with the outer class

public class InnerClasses {  // A class inside a class is called inner class

    static class Test {  // this line means that this class is associated with outer class not with object of outer class
        String name;
        public Test(String name) {  // Constructor means a function which has the same name as class name
            this.name = name;
        }
    }

    public static void main(String[] args) {  // Static method belongs to class not to object so it cannot access non static members directly
        Test a = new Test("gaurav");  // we can create object of static inner class without creating object of outer class
        Test b  = new Test("sanjana"); // we can create object of static inner class without creating object of outer class

        System.out.println(a.name + " " + b.name);
    }
}

