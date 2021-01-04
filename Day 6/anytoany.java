import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int res = getValue(n, sourceBase, destBase);
        System.out.println(res);
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = getValueIndecimal(n, b1);
        int dn = getValueInBase(dec, b2);
        return dn;
    }


    public static int getValueInBase(int n, int b) {


        int ans = 0;

        int pow = 1;

        while (n != 0) {
            int quo = n / b;
            int rem = n % b;

            n = quo;
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int rv = 0;

        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;
        }

        return rv;
    }


}