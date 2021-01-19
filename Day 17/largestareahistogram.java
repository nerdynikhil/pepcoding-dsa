import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nsr = NSEonRight(a);
        int[] nsl = NSEonLeft(a);

        int omax = 0;

        for (int i = 0; i < a.length; i++) {
            int height = a[i];
            int width = nsr[i] - nsl[i] - 1;


            int area = height * width;

            omax = Math.max(omax, area);
        }
        System.out.println(omax);
        // code
    }

    public static int[] NSEonRight(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, arr.length);

        Stack < Integer > st = new Stack < > ();

        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                int solvedidx = st.pop();
                ans[solvedidx] = i;
            }

            st.push(i);
        }



        return ans;
    }

    public static int[] NSEonLeft(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);

        Stack < Integer > st = new Stack < > ();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                int solvedidx = st.pop();
                ans[solvedidx] = i;
            }

            st.push(i);
        }



        return ans;
    }
}