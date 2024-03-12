
public class SudokuSolver {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {               // Checking Row
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {               // Checking Column
                return false;
            }
        }

        // Logic of Grid Checking
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solveSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') {
                    for (int number = 1; number <= 9; number++) {            // Add Number from  1 to 9
                        if (isSafe(board, row, col, number)) {
                            board[row][col] = (char) (number + '0');        // Adding 0 gives same Number
                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = '.';          // Back Tracking
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();                       // Created object using Class
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Sudoku = ");
        for (int i = 0; i < board.length; i++) {                    // Unsolved Sudoku in Console
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        if (solver.solveSudoku(board)) {                   // Object Called solveSudoku Public Method/Function
            System.out.println();
            System.out.println("Sudoku solved Successfully !");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }
}







//public class SudokuSolver {
//
//    public boolean isSafe(char[][] board,int row,int col,int numbers) {
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][col] == (char) (numbers + '0')) {
//                return false;
//            }
//            if (board[i][col] == (char) (numbers + '0')) {
//                return false;
//            }
//        }
//
//        int sr = (row / 3) * 3;
//        int sc = (col / 3) * 3;
//
//        for (int i = sr; i < sr + 3; i++) {
//            for (int j = sc; j < sr + 3; j++) {
//                if (board[i][j] == (char) (numbers + '0')) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//
//    public boolean helper(char[][] board,int row,int col) {
//        if (row == board.length) {
//            return true;
//        }
//        int nrow = 0;
//        int ncol = 0;
//        if (col != board.length - 1) {
//            nrow = row;
//            ncol = col + 1;
//        } else {
//            nrow = row + 1;
//            ncol = 0;
//        }
//        if(board[row][col] != '.'){
//            if(helper(board,nrow,ncol)){
//                return true;
//            }
//        }
//           else {
//               for (int i=1;i<=9;i++){
//                   if(isSafe(board,row,col,i)){
//                       board[row][col]=(char) (i+'0');
//                       if(helper(board,nrow,ncol)){
//                           return true;
//                       }
//                       else {
//                           board[row][col]='.';
//                       }
//                   }
//               }
//
//        }
//           return false;
//    }
//
//    public static void main(String[] args){
//        SudokuSolver obj = new SudokuSolver();
//        int n;
//        char[][] board = new char[9][9];
//        obj.helper(board,0,0);
//    }
//}

