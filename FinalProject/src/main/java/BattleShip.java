public class BattleShip {
    char[][] board;

    public BattleShip() {
        board = new char[10][10];
    }

    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '*';
            }
        }
    }

    void dispBoard() {
        int i, j;

        // Print column headers
        System.out.print("   ");
        for (i = 0; i < board.length; i++) {
            System.out.print((i + 1) + "   ");
        }
        System.out.println();

        // Print board with row indices and grid lines
        for (i = 0; i < board.length; i++) {
            System.out.print((i+1) + " ");  // Row index
            for (j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("  " + "------------------------------------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if ((row >= 0 && row <= 9) && (col >= 0 && col <= 9)) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid Position");
        }
    }

    char getCell(int row, int col) {
        return board[row][col];
    }
}
