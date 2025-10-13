package OOPS.Singleton;


// singleton class means only one object of this class can be created which can be used globally
public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}
