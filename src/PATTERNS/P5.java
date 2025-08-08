package PATTERNS;

/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
 Relationship between no of column in a particular row and find the formula
  if row > n
   col = n - (row - n ) = 2n - row
   else{
   col =  row
*/

public class P5 {
    public static void main(String[] args) {
        pattern5(5);

    }
    static void pattern5(int n){

        for(int row = 1; row < 2 * n; row++){
            int totalcol = row > n ? 2 * n - row  : row;
            for(int col = 0; col < totalcol; col++){
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}

