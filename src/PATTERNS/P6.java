package PATTERNS;


//         *
//        **
//       ***
//      ****
//     *****

public class P6 {
    public static void main(String[] args) {
        pattern5(5);


    }
    static void pattern5 (int n){
        for(int row = 1; row <= n; row++){
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

