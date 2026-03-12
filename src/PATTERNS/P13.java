package PATTERNS;


//          *
//         * *
//        *   *
//       *     *
//      *********
//
//
//         *********
//          *     *
//           *   *
//            * *
//             *
//
//
//               *
//              * *
//             *   *
//            *     *
//           *       *
//            *      *
//             *    *
//              *  *
//               *


public class P13 {
    public static void main(String[] args) {
        pattern13(5);

    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

            // Print stars and spaces (hollow triangle)
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Next line
        }
    }
}

