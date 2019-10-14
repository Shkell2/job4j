package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char temp = 'X';

        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
            System.out.println();
        }

        for (int i=0; i<board.length; i++) {
            int counter1 = 0;
            int counter2 = 0;
            if (temp == board[i][i]) {
                for (int j=0; j < board.length; j++) {
                    if ((counter1 < j) && (counter2 < j)) {break;}
                    if (temp == board[j][i]) {
                        counter1++;
                    }
                    if (temp == board[i][j]) {
                        counter2++;
                    }
                }
            if ((counter1 == board.length)||(counter2 == board.length)) {
                result = true;
                break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', 'X'},
                {'_', '_', 'X', '_', 'X'},
                {'_', '_', '_', '_', 'X'},
                {'_', '_', 'X', '_', 'X'},
                {'_', '_', 'X', '_', 'X'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', '_', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', 'X', 'X', 'X', 'X'},
                {'_', '_', 'X', 'X', 'X'},
                {'_', '_', 'X', '_', 'X'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
