import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;

        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print("*	");
            }
            nst--;
            System.out.println();
        }
    }
}