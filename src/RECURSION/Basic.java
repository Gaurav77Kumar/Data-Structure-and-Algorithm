package RECURSION;

public class Basic {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // This is called tail recursion
        // This is the last call
        print(n + 1);
    }
}


