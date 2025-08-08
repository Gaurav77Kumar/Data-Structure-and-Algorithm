package RECURSION;


public class fibonacci {
    public static void main(String[] args) {

        // Fibonacci series  = 0 1 2 3 5 8 13 ...
        // Fibonacci(N) = Fibonacci(N-1) + fibonacci(N -2) This is known as recurrence  relation
        // The base condition is represented by answer we already have  like f(0) = 0  and f(1) = 1
        // Break it down in smaller problem
        // Try to figure out Recursive tree


        System.out.println(fibo(6));


    }
    static int fibo(int n){

        // Base Condition
        if(n < 2){
            return n;
        }
        return fibo(n-1 ) + fibo(n-2);
    }
}
