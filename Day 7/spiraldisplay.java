import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner take = new Scanner(System.in);

        int n = take.nextInt();
        int m = take.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = take.nextInt();
            }
        }


        int minr = 0;
        int minc = 0;

        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int totalele = arr.length * arr[0].length;
        int count = 0;

        while (count < totalele) {

            //0th col
            for (int i = minr; i <= maxr && count < totalele; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            //last row
            for (int i = minc; i <= maxc && count < totalele; i++) {
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;

            //last column reversed
            for (int i = maxr; i >= minr && count < totalele; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            //first row reversed
            for (int i = maxc; i >= minc && count < totalele; i--) {
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;

        }

    }


}