import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;

        for (int i = 1; i <= n; i++) { //rows


            for (int k = 1; k <= nsp; k++) { //spaces
                System.out.print("	");
            }

            for (int j = 1; j <= nst; j++) { //stars
                System.out.print("*	");
            }

            nsp++;
            nst--;
            System.out.println();
        }
    }
}