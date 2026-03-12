package BACKTRACKING_MAZE_PROBLEMS;

public class All_Paths {
    public static  void main(String[] args) {


        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        Allpath("", board, 0, 0);

    }

    static void Allpath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // I am Considering this path in my Block
        maze[r][c] = false;

        if (r < maze.length - 1) {
            Allpath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            Allpath(p + 'R', maze, r, c + 1);
        }
        if( r > 0){
            Allpath(p+ 'U', maze, r - 1, c);
        }
        if ( c > 0 ){
            Allpath(p + 'L', maze, r, c - 1);
        }
        // this line is where the function will be over before the function get removed also remove the changes made ny function
        maze[r][c] = true;
    }
}
