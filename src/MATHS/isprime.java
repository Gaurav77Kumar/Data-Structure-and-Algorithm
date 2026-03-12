package MATHS;

public class isprime {
    public static void main(String[] args) {
        int n = 22;

        for(int i = 0; i <= n; ++i) {
            System.out.println("" + i + isPrime(i));
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for(int c = 2; c * c <= n; ++c) {
                if (n % c == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}

