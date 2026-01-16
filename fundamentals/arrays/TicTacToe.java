package fundamentals.arrays;

import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Random random = new Random();

        int xCount = 0;
        int oCount = 0;

        while (xCount < 5 || oCount < 4) {
            int i = random.nextInt(3);
            int j = random.nextInt(3);

            if (board[i][j] == '\u0000') {
                if (xCount < 5) {
                    board[i][j] = 'X';
                    xCount++;
                } else if (oCount < 4) {
                    board[i][j] = 'O';
                    oCount++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        if (checkWin(board, 'X')) {
            System.out.println("x wins");
        } else if (checkWin(board, 'O')) {
            System.out.println("o wins");
        } else {
            System.out.println("no winner");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                    board[1][j] == player &&
                    board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {
            return true;
        }

        return false;
    }
}
