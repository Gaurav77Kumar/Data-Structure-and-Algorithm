package RECURSION;

public class count_zero {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(countzeros(num));


    }
    static int countzeros(int n) {
        return helper(n,0);
    }

    private static int helper(int n,int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c+1);
        }
            return helper(n / 10, c);

    }
}