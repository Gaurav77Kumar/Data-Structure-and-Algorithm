package RECURSION;

public class Sum_of_digits {
    public static void main(String[] args) {
        int ans = digitsum(123);
        System.out.println(ans);

    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + digitsum(n/10);
    }
}
