package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;

        for (int i = 0; i < board[row].length; i++) {

            if (board[row][i] != 'X') {

                result = false;
                break;
            }

        }

        return result;

    }


    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {

            if (board[i][i] == 'X') {
                 boolean x = monoVertical(board, i);
                boolean y = monoHorizontal(board, i);
                result = x || y;
                if (result){
                    break;
                }


            }
        }
        return result;
    }

    public static void main (String[]args) {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        System.out.println(result);
    }

}







