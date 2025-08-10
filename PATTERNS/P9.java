package PATTERNS;


//       *********
//        *******
//         *****
//          ***
//           *

public class P9 {
    public static void main(String[] args) {
        pattern9(6);

    }
    static void pattern9(int n) {
        for (int row = n; row >= 1; row--) {
            // Print spaces
            for (int space = 1; space <= n -row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            // New line
            System.out.println();
        }
    }
}
