package PATTERNS;


//         * * * * *
//          * * * *
//           * * *
//            * *
//             *
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *
public class P12 {
    public static void main(String[] args) {
        pattern12(6);

    }
    static void pattern12(int n) {
        // Top half
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





