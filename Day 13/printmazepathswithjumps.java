import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int dr = take.nextInt();
        int dc = take.nextInt();
        printMazePaths(0, 0, dr - 1, dc - 1, "");
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


        for (int jump = 1; jump <= dc - sc; jump++)
            printMazePaths(sr, sc + jump, dr, dc, psf + "h" + jump);

        for (int jump = 1; jump <= dr - sr; jump++)
            printMazePaths(sr + jump, sc, dr, dc, psf + "v" + jump);

        for (int jump = 1; jump <= dc - sc && jump <= dr - sr; jump++)
            printMazePaths(sr + jump, sc + jump, dr, dc, psf + "d" + jump);

    }

}