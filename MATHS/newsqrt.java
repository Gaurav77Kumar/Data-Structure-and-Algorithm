package MATHS;

public class newsqrt {
    public static void main(String[] args) {
        System.out.println(sqrt((double)40.0F));
    }

    static double sqrt(double n) {
        double x = n;
        double root = (double)0.0F;

        while(true) {
            root = (double)0.5F * (x + n / x);
            if (Math.abs(root - x) < (double)1.0F) {
                return root;
            }

            x = root;
        }
    }
}

