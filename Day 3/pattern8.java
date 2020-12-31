import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp = n - 1;

        for (int i = 1; i <= n; i++) { //rows
            for (int k = 1; k <= nsp; k++) { //spaces
                System.out.print("	");
            }
            for (int j = 1; j <= nst; j++) { //star
                System.out.print("*	");
            }
            nsp--;
            System.out.println();
        }
    }
}