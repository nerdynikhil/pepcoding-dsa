import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int n = take.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        int output = factorial(n - 1) * n;
        return output;
    }

}