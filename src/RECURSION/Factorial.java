package RECURSION;

public class Factorial {
    public static void main(String[] args) {
        int ans = fac(5);
        System.out.println(ans);

    }

    static int fac(int n){
        if(n==1 || n ==0){
            return n;
        }
        return n * fac(n-1);

    }
}
