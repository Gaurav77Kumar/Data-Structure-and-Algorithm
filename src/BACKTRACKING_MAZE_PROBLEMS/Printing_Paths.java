package BACKTRACKING_MAZE_PROBLEMS;

import java.util.ArrayList;

public class Printing_Paths {
    public static void main(String[] args) {
        Printing_path("", 3, 3);
    }
    static void Printing_path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            Printing_path(p + 'D', r-1, c);
        }
        if( c > 1){
            Printing_path(p+'R', r, c - 1);
        }

    }
}
