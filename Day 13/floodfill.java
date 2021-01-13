import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int n = take.nextInt();
        int m = take.nextInt();

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = take.nextInt();
            }
        }

        boolean[][] vis = new boolean[n][m];

        floodfill(maze, 0, 0, "", vis);
    }

    public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        if (sr > maze.length - 1 || sc > maze[0].length - 1 || sr < 0 || sc < 0 || maze[sr][sc] == 1 || visited[sr][sc] == true) {
            return;
        }

        //dr =  maze.length-1
        //dc = maze[0].length -1
        visited[sr][sc] = true;
        floodfill(maze, sr - 1, sc, psf + "t", visited);
        floodfill(maze, sr, sc - 1, psf + "l", visited);
        floodfill(maze, sr + 1, sc, psf + "d", visited);
        floodfill(maze, sr, sc + 1, psf + "r", visited);
        visited[sr][sc] = false;
    }
}