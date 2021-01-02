import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp = n / 2;
        int val = 1;

        for (int i = 1; i <= n; i++) { //rows


            for (int k = 1; k <= nsp; k++) { //spaces
                System.out.print("	");
            }

            int cval = val;
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print(cval + "	");

                if (j <= nst / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                nst = nst + 2;
                nsp--;
                val++;
            } else {
                nst = nst - 2;
                nsp++;
                val--;
            }

            System.out.println();
        }
    }
}