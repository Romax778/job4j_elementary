package ru.job4j.array;

public class MatrixCheck {
  /*  public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;


        for (int i = 0; i < board.length-1; i++) {

            for (int j = 0; j < board[i].length-1; j++) {

                if ((board[i][j+1]) != 'X' ) {
                    result = false;
                    break;

                }

            }


        }
        return result;
    }*/
    public static char[]extractDiagonal(char[][]board){
        char[]rsl=new char[board.length];
        char ch = 'X';
        for(int i=0;i<rsl.length-1; i++){
            rsl[i+1]=board[i][i];
            rsl[i]= ch; ;

            }

        return rsl;

        }


    }





