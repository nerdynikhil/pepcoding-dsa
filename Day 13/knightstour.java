import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int n = take.nextInt();
        int sr = take.nextInt();
        int sc = take.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, 1, sr, sc);
    }

    public static void printKnightsTour(int[][] chess, int movecount, int sr, int sc) {

        if (sr < 0 || sc < 0 || sr > chess.length - 1 || sc > chess[0].length - 1 || chess[sr][sc] != 0) {
            return;
        }

        if (movecount == chess.length * chess[0].length) {
            chess[sr][sc] = movecount;
            displayBoard(chess);
            chess[sr][sc] = 0;
            return;
        }

        chess[sr][sc] = movecount;
        printKnightsTour(chess, movecount + 1, sr - 2, sc + 1);
        printKnightsTour(chess, movecount + 1, sr - 1, sc + 2);
        printKnightsTour(chess, movecount + 1, sr + 1, sc + 2);
        printKnightsTour(chess, movecount + 1, sr + 2, sc + 1);
        printKnightsTour(chess, movecount + 1, sr + 2, sc - 1);
        printKnightsTour(chess, movecount + 1, sr + 1, sc - 2);
        printKnightsTour(chess, movecount + 1, sr - 1, sc - 2);
        printKnightsTour(chess, movecount + 1, sr - 2, sc - 1);
        chess[sr][sc] = 0;
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}