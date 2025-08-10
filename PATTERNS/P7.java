package PATTERNS;


//       *****
//        ****
//         ***
//          **
//           *

public class P7 {
    public static void main(String[] args) {
        pattern7(5);

    }

    static void pattern7 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n -  row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

