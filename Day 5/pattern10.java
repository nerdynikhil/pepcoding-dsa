import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nsp1 = n / 2;
        int nsp2 = -1;

        for (int i = 1; i <= n; i++) { //rows


            for (int k = 1; k <= nsp1; k++) { //spaces1
                System.out.print("	");
            }

            System.out.print("*	"); //star


            for (int k = 1; k <= nsp2; k++) { //spaces
                System.out.print("	");
            }

            if (i > 1 && i < n) { //conditional star
                System.out.print("*	");
            }


            if (i <= n / 2) {
                nsp1--;
                nsp2 += 2;
            } else {
                nsp1++;
                nsp2 -= 2;
            }

            System.out.println();
        }
    }
}