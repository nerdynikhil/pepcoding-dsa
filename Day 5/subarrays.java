import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner take = new Scanner(System.in);

        int n = take.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = take.nextInt();
        }


        for (int sp = 0; sp < arr.length; sp++) {
            for (int ep = sp; ep < arr.length; ep++) {
                for (int i = sp; i <= ep; i++) {
                    System.out.print(arr[i] + "	");
                }
                System.out.println();
            }
        }

    }

}