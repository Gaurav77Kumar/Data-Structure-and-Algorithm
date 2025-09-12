package BACKTRACKING_MAZE_PROBLEMS;

import java.util.Arrays;

public class Printing_All_Paths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length ];

        AllpathPrint("", board, 0, 0,path, 1);

    }
    static void AllpathPrint(String p, boolean[][] maze, int r, int c, int[][]path, int steps) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;

            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // I am Considering this path in my Block
        maze[r][c] = false;

        path[r][c] = steps;

        if (r < maze.length - 1) {
            AllpathPrint(p + 'D', maze, r + 1, c, path, steps+1);
        }
        if (c < maze[0].length - 1) {
            AllpathPrint(p + 'R', maze, r, c + 1, path, steps+1);
        }
        if( r > 0){
            AllpathPrint(p+ 'U', maze, r - 1, c, path, steps+1);
        }
        if ( c > 0 ){
            AllpathPrint(p + 'L', maze, r, c - 1, path, steps+1);
        }
        // this line is where the function will be over before the function get removed also remove the changes made ny function
        maze[r][c] = true;
        path[r][c] =0;
    }
}


