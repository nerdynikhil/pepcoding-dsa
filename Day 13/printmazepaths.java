import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int n = take.nextInt();
        int m = take.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        if (sr > dr || sc > dc) {
            return;
        }
        printMazePaths(sr, sc + 1, dr, dc, psf + 'h');
        printMazePaths(sr + 1, sc, dr, dc, psf + 'v');
    }

}