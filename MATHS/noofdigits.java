package MATHS;

public class noofdigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int)(Math.log((double)n) / Math.log((double)b)) + 1;
        System.out.println(ans);
    }
}

