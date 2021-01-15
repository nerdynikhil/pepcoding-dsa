import java.util.*;

public class Main {

    public static int[] mergeWithNoSpace(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            ans[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[sc.nextInt()];
        int[] B = new int[sc.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        int[] mergedArray = mergeWithNoSpace(A, B);
        print(mergedArray);
    }

}