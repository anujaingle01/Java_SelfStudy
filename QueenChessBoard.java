
import java.util.ArrayList;
import java.util.List;

class QueenChessBoard {
    public boolean isSafe(int row, int col, char[][] board) {

//         Check horizontal and vertical positions
//        for (int i = 0; i < board.length; i++) {
//            if (board[row][i] == 'Q' || board[i][col] == 'Q') {
//                return false;
//            }
//        }

        // Horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

//        // Check diagonals
//        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }

        // Upper Left       r-1,c-1
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper Right      r-1,c+1
        r = row;
        for (int c = col; c < board.length && r >=0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower Left       r+1,c-1
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower Right      r+1,c+1
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
//        List<String> newBoard = new ArrayList<>();
//
//        for (char[] row : board) {
//            newBoard.add(new String(row));
//        }
//
//        allBoards.add(newBoard);

        String row = "";
        List<String> newBoard = new ArrayList<>();                  // ["   "]

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q'){
                    row += 'Q';                                     // Add Q
                }
                else{
                    row += '.';                                     // Add Dot .
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);

    }

    public void helper(char[][] board, List<List<String>> allBoards, int column) {
        if (column == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, column, board)) {
                board[row][column] = 'Q';
                helper(board, allBoards, column + 1);
                board[row][column] = '.';
            }
        }

    }

    public List<List<String>> solveQueen(int n) {                       // Public Method
        List<List<String>> allBoards = new ArrayList<>();               // [["   "]]
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {
        int n=4;                                                    // n = 1 to 14 Runs in Console Window
        QueenChessBoard obj = new QueenChessBoard();                // Created Object of Class
        List<List<String>> solutions = obj.solveQueen(n);           // Called Public Method using object of Class

        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println("\""+row+"\""+", ");
            }
            System.out.println();
        }
    }
}


