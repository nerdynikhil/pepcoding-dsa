import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);

        int n1 = take.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = take.nextInt();
        }
        int n2 = take.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = take.nextInt();
        }

        int len = Math.max(n1, n2) + 1;


        int[] ans = new int[len];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int carry = 0;


        while (k >= 0) {
            int sum = 0;

            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }

            sum = sum + carry;

            int rem = sum % 10;
            int quo = sum / 10;

            carry = quo;
            ans[k] = rem;

            i--;
            j--;
            k--;
        }

        if (ans[0] != 0) {
            System.out.println(ans[0]);
        }


        for (int m = 1; m < ans.length; m++) {
            System.out.println(ans[m]);
        }

    }

}