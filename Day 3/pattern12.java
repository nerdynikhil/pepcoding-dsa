import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int prev = 0;
        int next = 1;

        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print(prev + "	");

                int nextfib = prev + next;
                prev = next;
                next = nextfib;
            }
            nst++;
            System.out.println();
        }
    }
}