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

        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx) {
        int max = arr[idx];
        if (idx == arr.length) {
            return;
        }
        if (tempmax)
            int tempmax = maxOfArray(arr, idx + 1);
    }

}

}