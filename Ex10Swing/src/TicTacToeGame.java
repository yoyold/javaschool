public class TicTacToeGame {
    private static final int BOARD_SIZE = 3;
    private String[][] board;
    private String currentPlayer;

    public TicTacToeGame() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        currentPlayer = "X";
        reset();
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] == null) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
    }

    public String getCurrentPlayerSymbol() {
        return currentPlayer;
    }

    public boolean checkWin() {
        // Check rows
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (board[row][0] != null && board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2])) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (board[0][col] != null && board[0][col].equals(board[1][col]) && board[0][col].equals(board[2][col])) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return true;
        }

        if (board[0][2] != null && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
            return true;
        }

        return false;
    }

    public boolean isBoardFull() {
        for (String[] row : board) {
            for (String cell : row) {
                if (cell == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reset() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = null;
            }
        }
        currentPlayer = "X";
    }
}
