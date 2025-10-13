package OOPS.Singleton;


// singleton class means only one object of this class can be created which can be used globally
public class Singleton {
    private Singleton() {  // private constructor so that no one can create object of this class from outside the class

    }

    private static Singleton instance;  // static variable to hold the single instance of the class

    public static Singleton getInstance() {  // static method to provide the single instance of the class
        if (instance == null) {
            instance = new Singleton();  // create the object if it is not created yet
        }
        return instance;  // return the single instance of the class

    }

}
