package PATTERNS;


//         * * * * *
//          * * * *
//           * * *
//            * *
//             *

public class P11 {
    public static void main(String[] args) {
        pattern11(5);

    }
    static void pattern11(int n) {
        for (int row = n; row >= 1; row--) {
            // Print leading spaces
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }

            // Print stars with space
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}


