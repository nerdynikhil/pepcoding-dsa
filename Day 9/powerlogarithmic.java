import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int x = take.nextInt();
        int n = take.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {

        if (n == 0)
            return 1;

        int ans = power(x, n / 2) * power(x, n / 2);

        if (n % 2 != 0)
            ans *= x;

        return ans;
    }

}