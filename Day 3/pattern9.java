import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp1 = 0;
        int nsp2 = n - 2;

        for (int i = 1; i <= n; i++) { //rows

            for (int k = 1; k <= nsp1; k++) { //spaces
                System.out.print("	");
            }

            for (int j = 1; j <= nst; j++) { //star
                System.out.print("*	");
            }

            for (int k = 1; k <= nsp2; k++) { //spaces
                System.out.print("	");
            }

            for (int j = 1; j <= nst; j++) { //star
                if (i != (n / 2 + 1)) {
                    System.out.print("*	");
                }
            }

            if (i <= n / 2) {
                nsp1++;
                nsp2 = nsp2 - 2;
            } else {
                nsp1--;
                nsp2 = nsp2 + 2;
            }

            System.out.println();
        }
    }
}