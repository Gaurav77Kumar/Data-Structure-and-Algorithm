package BACKTRACKING_MAZE_PROBLEMS;

public class N_Knights {
    public static void main(String[] args) {
        int n = 4;   // board size
        int k = 4;   // number of knights to place
        boolean[][] board = new boolean[n][n];

        int solutions = knight(board, 0, 0, k);
        System.out.println("Total solutions: " + solutions);
    }

    static int knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        if (row == board.length - 1 && col == board.length) {
            return 0;
        }

        if (col == board.length) {
            return knight(board, row + 1, 0, knights);
        }

        int count = 0;

        // Place knight if it's safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // Skip this cell
        count += knight(board, row, col + 1, knights);

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Possible knight attack moves (only from above or left since we go row-wise)
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) return false;
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) return false;
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) return false;
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) return false;

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
