package RECURSION;

public class Sum_N_to_1 {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}

